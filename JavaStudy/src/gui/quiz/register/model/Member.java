package gui.quiz.register.model;

import java.util.Date;

public class Member {
	private String mem_id;
	private String password;
	private String mem_name;
	private Integer age;
	private Date birthday;
	private String gender;
	private String interest1;
	private String interest2;
	private String interest3;
	private Boolean sms;
	private String email;
	private String phone_number;
	
	public Member() {}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterest1() {
		return interest1;
	}

	public void setInterest1(String interest1) {
		this.interest1 = interest1;
	}

	public String getInterest2() {
		return interest2;
	}

	public void setInterest2(String interest2) {
		this.interest2 = interest2;
	}

	public String getInterest3() {
		return interest3;
	}

	public void setInterest3(String interest3) {
		this.interest3 = interest3;
	}

	public Boolean getSms() {
		return sms;
	}

	public void setSms(Boolean sms) {
		this.sms = sms;
	}
	
	
}
