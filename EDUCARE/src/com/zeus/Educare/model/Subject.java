package com.zeus.Educare.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="SubjectDTO")
public class Subject {
	
	@Id
	private String sID;
	private String sName;
	private String sType;
	private int NO_Days;
	/*
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="EMP_Subject",joinColumns=@JoinColumn(name="sID"),inverseJoinColumns=@JoinColumn(name="empID"))
	List<EMPDTO> eList;*/

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsType() {
		return sType;
	}

	public void setsType(String sType) {
		this.sType = sType;
	}

	public int getNO_Days() {
		return NO_Days;
	}

	public void setNO_Days(int nO_Days) {
		NO_Days = nO_Days;
	}

	@Override
	public String toString() {
		return "Subject [sID=" + sID + ", sName=" + sName + ", sType=" + sType + ", NO_Days=" + NO_Days + "]";
	}

/*	public List<EMPDTO> geteList() {
		return eList;
	}

	public void seteList(List<EMPDTO> eList) {
		this.eList = eList;
	}
	*/
	
	
}
