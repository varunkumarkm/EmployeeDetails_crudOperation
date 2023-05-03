package com.employee.details.Entity;

import java.sql.Date;

import org.aspectj.apache.bcel.ExceptionConstants;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Employee")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "id", nullable=false)
	private long id;
	
	@NotEmpty(
	        message
	        = "First name cannot be null and must have size greater than 0")
	private String firstName;
	
	@NotEmpty(
	        message
	        = "lastName cannot be null and must have size greater than 0")
	private String lastName;
	
	
	private Date dateOfJoining;
	
	@NotEmpty(
	        message
	        = "email cannot be null and must have size greater than 0")
	private String email;
	
	@NotNull
	@Min(10)
	private long mobile;
	
	@NotEmpty(
	        message
	        = "role cannot be null and must have size greater than 0")
	private String role;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfJoining="
				+ dateOfJoining + ", email=" + email + ", mobile=" + mobile + ", role=" + role + "]";
	}
	public EmployeeDetails(long id, String firstName, String lastName, Date dateOfJoining, String email, long mobile,
			String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.email = email;
		this.mobile = mobile;
		this.role = role;
	}
	public EmployeeDetails() {
		super();
	}
}
