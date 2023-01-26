package database.quiz.datamodel;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeAndDepartment {
	
	private Integer department_id;
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private Integer salary;
	private Double commission_pct;
	private Integer manager_id;
	private Department department;
	
	public EmployeeAndDepartment() {}
	
	public EmployeeAndDepartment(ResultSet rs) throws SQLException {
		department_id  = rs.getInt(1);
		employee_id    = rs.getInt(2);
		first_name     = rs.getString(3);
		last_name      = rs.getString(4);
		email          = rs.getString(5);
		phone_number   = rs.getString(6);
		hire_date      = rs.getDate(7);
		job_id         = rs.getString(8);
		salary         = rs.getInt(9);
		commission_pct = rs.getDouble(10);
		manager_id     = rs.getInt(11);
		department     = new Department(rs);

	}
	
	public Integer getDepartment_id() {
		return department_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public Integer getSalary() {
		return salary;
	}
	public Double getCommission_pct() {
		return commission_pct;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public String getDepartment_name() {
		return department.getDepartment_name();
	}
	
	public Integer getDepartmentManager_id() {
		return department.getManager_id();
	}
	
	public Integer getLocation_id() {
		return department.getLocation_id();
	}

	@Override
	public String toString() {
		return String.format("%s/%d/%d\n", first_name, manager_id, getDepartmentManager_id());
	}
	

}
