package register.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.OjdbcConnection;

public class RegisterToDB {
	
	public RegisterToDB(MemberDataModel member) {
		String sql = "INSERT INTO members VALUES (?,?,?,?,?,?,?,?,?)";
		
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);				
		) {
			pstmt.setString(1, member.getMem_id());
			pstmt.setString(2, member.getMem_pw());
			pstmt.setString(3, member.getMem_name());
			pstmt.setInt(4, member.getAge());
			pstmt.setString(5, member.getRegident_num());
			pstmt.setString(6, member.getInterest());
			pstmt.setString(7, member.getSms());
			pstmt.setString(8, member.getEmail());
			pstmt.setString(9, member.getPhonenumber());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
