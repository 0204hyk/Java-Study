package database.quiz.datamodel;

public class Join {
	Employee e;
	Department d;
	
	public Join(Employee e, Department d) {
		this.e = e;
		this.d = d;
	}

	public Employee getE() {
		return e;
	}

	public Department getD() {
		return d;
	}

	@Override
	public String toString() {
	
		return String.format("%d / %d / %s / %s / %s / %s / %s / %s / %d / %.2f / %d / %s / %d / %d\n", 
				e.getDepartment_id(),
				e.getEmployee_id(),
				e.getFirst_name(),
				e.getLast_name(),
				e.getEmail(),
				e.getPhone_number(),
				e.getHire_date(),
				e.getJob_id(),
				e.getSalary(),
				e.getCommission_pct(),
				e.getManager_id(),
				d.getDepartment_name(),
				d.getManager_id(),
				d.getLocation_id());
	}
}
