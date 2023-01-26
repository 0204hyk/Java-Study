package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class J02_PrepareStatement {
	
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	
	public static void main(String[] args) {
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		int user = 50;
		String keyword = "%i%";
		String sql = "SELECT * FROM employees WHERE department_id = ?"
				+ "AND first_name LIKE ?";
		
		try (
			Connection conn = DriverManager.getConnection(url, "hr", "1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, user);       // sql의 첫번째 물음표에 user 값을 넣기
			pstmt.setString(2, keyword); // sql의 두번째 물음표에 keyword 값을 넣기
			
			try (ResultSet rs = pstmt.executeQuery()) {
				while(rs.next()) {
					System.out.printf("%-20s\t%d\t%-8s\t%d\n", 
							rs.getString("first_name") + ' ' + rs.getString("last_name"),
							rs.getInt("salary"),
							rs.getString("job_id"),
							rs.getInt("department_id"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
