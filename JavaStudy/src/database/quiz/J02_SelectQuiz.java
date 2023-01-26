package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J02_SelectQuiz {
	/*
	 	testuser 계정에 테이블을 아무거나 (컬럼 4개 이상) 추가하고 데이터를 추가한 뒤
	 	자바에서 Select로 조회한 결과를 콘솔에 출력해보세요
	 	
	 	* DATE 타입 넣어서 해보기
	 */
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
							   
	
	public static void main(String[] args) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		String sql = "SELECT * FROM test_table";
		
		try (
			Connection conn = DriverManager.getConnection(url, "testuser", "1234");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			while (rs.next()) {
				System.out.printf("%d\t%s\t%s\t%s\n",
						rs.getInt("test_id"),
						rs.getString("test_name"),
						rs.getString("test_phonenubmer"),
						rs.getDate("test_birthday"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
