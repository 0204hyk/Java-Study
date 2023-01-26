package register.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.OjdbcConnection;
import register.swing.LoginFrame;

public class MemberInfo {
	
	public MemberInfo() {
		String Sql = "SELECT mem_id, mem_pw FROM members WHERE mem_id = ? AND mem_pw = ?";
		
		try (
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(Sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			if(rs.next()) {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
