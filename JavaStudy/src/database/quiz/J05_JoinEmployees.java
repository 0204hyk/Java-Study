package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.OjdbcConnection;
import database.quiz.datamodel.Department;
import database.quiz.datamodel.Employee;
import database.quiz.datamodel.Join;

public class J05_JoinEmployees {
	/*
	 	employees와 departments를 조인한 결과를 조회하여 데이터 모델에 담아 모두 출력해보세요
	 */
	public static void main(String[] args) {
		
		String sql1 = "SELECT * FROM employees ORDER BY department_id";
		String sql2 = "SELECT * FROM departments";
		
		List<Employee> employees = new ArrayList<>();
		List<Department> departments = new ArrayList<>();
		List<Join> result = new ArrayList<>();
		
		try (
			Connection conn = OjdbcConnection.getConnection();
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			ResultSet rs1 = pstmt1.executeQuery();
			ResultSet rs2 = pstmt2.executeQuery();
		) {

			while (rs1.next()) {
				Employee e = new Employee();			
				
				e.setEmployee_id(rs1.getInt("employee_id"));
				e.setFirst_name(rs1.getString("first_name"));
				e.setLast_name(rs1.getString("last_name"));
				e.setEmail(rs1.getString("email"));
				e.setPhone_number(rs1.getString("phone_number"));
				e.setHire_date(rs1.getDate("hire_date"));
				e.setJob_id(rs1.getString("job_id"));
				e.setSalary(rs1.getInt("salary"));
				e.setCommission_pct(rs1.getDouble("commission_pct"));
				e.setManager_id(rs1.getInt("manager_id"));
				e.setDepartment_id(rs1.getInt("department_id"));
				
				employees.add(e);
			}
			
			while (rs2.next()) {
				Department d = new Department();

				d.setDepartment_id(rs2.getInt("department_id"));
				d.setDepartment_name(rs2.getString("department_name"));
				d.setManager_id(rs2.getInt("manager_id"));
				d.setLocation_id(rs2.getInt("location_id"));
				
				departments.add(d);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (int i = 0 ; i < employees.size(); ++i) {
			for (int j = 0; j < departments.size(); ++j)
			if (employees.get(i).getDepartment_id() == departments.get(j).getDepartment_id()) {
				Join join = new Join(employees.get(i), departments.get(j));				
				result.add(join);
			}
		}

		System.out.println(result);
	}
}
