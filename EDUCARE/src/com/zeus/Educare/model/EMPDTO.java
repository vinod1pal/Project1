package com.zeus.Educare.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="EmployeeDTO")
public class EMPDTO {
	
	@Id
	@GeneratedValue
	private int id;
	private String empID;
	private String empName;
	private String empUSN;
	private String empPWD;
	private String empMailID;
	private String empMob;
	
	
	/*@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="EMP_Subject",joinColumns=@JoinColumn(name="empID"),inverseJoinColumns=@JoinColumn(name="sID"))
	private List<Subject> sList;
*/
	
	
	
	/*public List<Subject> getsList() {
		return sList;
	}
	public void setsList(List<Subject> sList) {
		this.sList = sList;
	}*/
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpUSN() {
		return empUSN;
	}
	public void setEmpUSN(String empUSN) {
		this.empUSN = empUSN;
	}
	public String getEmpPWD() {
		return empPWD;
	}
	public void setEmpPWD(String empPWD) {
		this.empPWD = empPWD;
	}
	public String getEmpMailID() {
		return empMailID;
	}
	public void setEmpMailID(String empMailID) {
		this.empMailID = empMailID;
	}
	public String getEmpMob() {
		return empMob;
	}
	public void setEmpMob(String empMob) {
		this.empMob = empMob;
	}
	
	
	
	
	
}
