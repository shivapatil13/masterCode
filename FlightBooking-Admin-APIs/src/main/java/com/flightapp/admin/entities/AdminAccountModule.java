package com.flightapp.admin.entities;

public class AdminAccountModule {

	private Integer adminAccId;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private Integer age;
	private String mobileNumber;
	private String email;
	private String password;
	private String location;
	private Long ssn;
	private String role;
	private String activeSwitch;
	private String createdDate;
	private String updatedDate;
	private String createdBy;
	private String updatedBy;

	public Integer getAdminAccId() {
		return adminAccId;
	}

	public void setAdminAccId(Integer adminAccId) {
		this.adminAccId = adminAccId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getActiveSwitch() {
		return activeSwitch;
	}

	public void setActiveSwitch(String activeSwitch) {
		this.activeSwitch = activeSwitch;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "AdminAccountModule [adminAccId=" + adminAccId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", mobileNumber=" + mobileNumber + ", email="
				+ email + ", password=" + password + ", location=" + location + ", ssn=" + ssn + ", role=" + role
				+ ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

}
