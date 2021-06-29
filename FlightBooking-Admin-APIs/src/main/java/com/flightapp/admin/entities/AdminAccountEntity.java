package com.flightapp.admin.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "ADMIN_ACCOUNT")
public class AdminAccountEntity {

	@Id
	@GeneratedValue(generator = "adminAcc_sec")
	@SequenceGenerator(sequenceName = "admin_Account_seq", name = "adminAcc_sec", allocationSize = 1, initialValue = 1)
	private Integer adminAccId;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private Integer age;
	private String email;
	private String password;
	private String mobileNumber;
	private String location;
	private Long ssn;
	private String role;
	private String activeSwitch;
	@CreationTimestamp
	private Date createdDate;
	@CreationTimestamp
	private Date updatedDate;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
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
		return "AdminAccountEntity [adminAccId=" + adminAccId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", email=" + email + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", location=" + location + ", ssn=" + ssn + ", role=" + role
				+ ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", createdBy=" + createdBy + ", updatedBy=" + updatedBy + "]";
	}

}
