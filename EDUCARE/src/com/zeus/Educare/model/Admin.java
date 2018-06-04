package com.zeus.Educare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	@GeneratedValue
	private int aID;
	private String adminUSN;
	private String adminPWD;
	private String adminName;
	private String empID;
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getAdminUSN() {
		return adminUSN;
	}
	public void setAdminUSN(String adminUSN) {
		this.adminUSN = adminUSN;
	}
	public String getAdminPWD() {
		return adminPWD;
	}
	public void setAdminPWD(String adminPWD) {
		this.adminPWD = adminPWD;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	
	
}
