package com.zeus.Educare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zeus.Educare.dao.dao;
import com.zeus.Educare.model.Admin;
import com.zeus.Educare.model.EMPDTO;
import com.zeus.Educare.model.Subject;

@Component
public class services {
	
	/*@Autowired
	dao d;
	*/
	
	
	public EMPDTO verifyService(String usn,String pwd) {
		dao d=new dao();
		System.out.println("service emp verfication");
		EMPDTO e=d.verfiyEmp(usn, pwd);
		return e;
	}
	
	
	public Admin verfiyAdminService(String ausn,String apwd) {
		dao d=new dao();
		System.out.println("service admin verfication");
		Admin a=d.verfiyAdmin(ausn, apwd);
		return a;
	}
	
	
	public boolean regService(EMPDTO e) {
		dao d=new dao();
		System.out.println("service :"+e);
		boolean fg=d.registerEmp(e);
		return fg;
	}
	public boolean regAdminService(Admin a) {
		System.out.println("serviceAdminreg");
		dao d=new dao();
		boolean fg=d.regAdmin(a);
		return fg;
	}
	
	
	public boolean addSubjectService(Subject s) {
		dao d=new dao();
		boolean fg=d.addSubject(s);
		return fg;
		
		
	}
	
	
	public void updateSubject(Subject s) {
		dao d=new dao();
		
	}
	public List<Subject> viewSubjectService() {
		dao d=new dao();
		List<Subject> s=d.viewSubject();
		return s;
	}
	
	public boolean adminDeleteService(Subject s) {
		dao d=new dao();
		boolean fg=d.adminDelete(s);
		return fg;
	}
	
	public boolean applySubService(Subject s,String eID,String eName) {
		dao d=new dao();
		boolean fg=d.applySub(s, eID, eName);
		return fg;
	}
	
	public EMPDTO getEmpService(String eID) {
		dao d=new dao();
		EMPDTO e=d.getEmp(eID);
		return e;
	}
}
