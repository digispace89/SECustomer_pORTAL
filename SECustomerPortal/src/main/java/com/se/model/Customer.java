package com.se.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8030106043257884361L;


	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	

	@Column(name="email", nullable=false, unique = true, length=75)
	private String email;
	
	@Column(name="username", nullable=false, unique = true, length=20)
	private String username;
	
	@Column(name="password", nullable=false, length=20)
	private String password;
	
	@Column(name="name", nullable=false, unique = true, length=75)
	private String name;
	
	@Column(name="customer_type", nullable=false, unique = true, length=20)
	private String type; //ENUM pharmacy doctor hospital
	
	@Column(name="tin",  unique = true, length=20)
	private String tin;
	
	@Column(name="gst",  unique = true, length=20)
	private String gst;
	
	@Column(name="pan",  unique = true, length=20)
	private String pan;
	
	@Column(name="license_number", unique = true, length=20)
	private String licenseNumber;
	
	@Column(name="customer_code",  unique = true, length=30)
	private String customerCode;
	
	@Column(name="is_active")
	private boolean isActive= true;
	
	@Column(name="created_date", nullable=false)
	private Date createdDate;
	
	@Column(name="deleted_date")
	private Date deletedDate;
	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getDeletedDate() {
		return deletedDate;
	}
	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ ", name=" + name + ", type=" + type + ", tin=" + tin + ", gst=" + gst + ", pan=" + pan
				+ ", licenseNumber=" + licenseNumber + ", customerCode=" + customerCode + ", isActive=" + isActive
				+ ", createdDate=" + createdDate + ", deletedDate=" + deletedDate + "]";
	}
}
