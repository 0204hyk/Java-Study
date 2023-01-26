package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.OjdbcConnection;
import database.quiz.datamodel.EmployeeAndDepartment;

public class J05_joinEmployees_Solve {
	public static void main(String[] args) {
		ArrayList<EmployeeAndDepartment> list = new ArrayList<>();
		String query = "SELECT * FROM employees INNER JOIN departments USING (department_id)";
		
		try (
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
		){
			while (rs.next()) {
				list.add(new EmployeeAndDepartment(rs)); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
	}
}
