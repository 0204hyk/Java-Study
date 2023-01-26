package register.db;

public class MemberDataModel {
	private String mem_id;
	private String mem_pw;
	private String mem_name;
	private Integer age;
	private String regident_num;
	private String interest;
	private String sms;
	private String email;
	private String phonenumber;
	
	public MemberDataModel() {}
	
	public MemberDataModel(String mem_id, String mem_pw, String mem_name, Integer age,
			String regident_num, String interest, String sms, String email, String phonenumber) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.age = age;
		this.regident_num = regident_num;
		this.interest = interest;
		this.sms = sms;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	
	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getRegident_num() {
		return regident_num;
	}

	public void setRegident_num(String regident_num) {
		this.regident_num = regident_num;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return String.format("%s의 정보\n", getMem_id());
	}
	
}
