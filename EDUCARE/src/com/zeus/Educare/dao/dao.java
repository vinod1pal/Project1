package com.zeus.Educare.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zeus.Educare.model.Admin;
import com.zeus.Educare.model.EMPDTO;
import com.zeus.Educare.model.EmpApplied;
import com.zeus.Educare.model.Subject;

@Component
public class dao {
	
	/*@Autowired
	SessionFactory sf;
	*/
	/*@Autowired
	Configuration cfg;*/
	public EMPDTO verfiyEmp(String usn,String pwd) {
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EMPDTO.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		System.out.println("dao emp verfication");
		//Session ss=cfg.buildSessionFactory().openSession();
		EMPDTO e=null;
		
		Criteria c=ss.createCriteria(EMPDTO.class);
		List<EMPDTO> eList=c.list();
		for (EMPDTO empdto : eList) {
			if(empdto.getEmpUSN().equals(usn)&&empdto.getEmpPWD().equals(pwd))
				e=empdto;
		}
		sf.close();
		
		return e;
	}
	
	public Admin verfiyAdmin(String usn,String pwd) {
		
		System.out.println("dao admin verfication");
		
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		/*Query q=ss.createQuery("from Admin where adminUSN=? and adminPWD=?");
		q.setParameter(0, usn);
		q.setParameter(1, pwd);
		Admin a=(Admin)q.uniqueResult();*/
		
		
		
		
		Criteria c=ss.createCriteria(Admin.class);
		List<Admin> aList=c.list();
		Admin a=null;
		for (Admin admin : aList) {
			if(admin.getAdminUSN().equals(usn)&&admin.getAdminPWD().equals(pwd))
				a=admin;
		}
		System.out.println(a);
		return a;
		
	}
	
	public boolean registerEmp(EMPDTO e) {
		try {
			System.out.println(e);
			//Session ss=cfg.buildSessionFactory().openSession();
			Configuration cfg =new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(EMPDTO.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			
			System.out.println(ss);
			ss.saveOrUpdate(e);
		ss.beginTransaction().commit();
		ss.close();
		
		}
		catch (Exception e1) {
			System.out.println(e1);
			return false;
			
		}
		
	
	return true;
}
	public boolean regAdmin(Admin a) {
		try {
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Admin.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		ss.saveOrUpdate(a);
		ss.beginTransaction().commit();
		System.out.println("daoAdminreg");
		ss.close();
		sf.close();
		return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean addSubject(Subject s) {
		try {
			Configuration cfg =new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Subject.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			ss.saveOrUpdate(s);
			ss.beginTransaction().commit();
			System.out.println("daoaddSubject");
			ss.close();
			sf.close();
			return true;
			}
			catch (Exception e) {
				return false;
			}
	}
	public boolean updateSubject(Subject s) {
		try {
			Configuration cfg =new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Subject.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Query q=ss.createQuery("update Subject set sName=?,sType=?,NO_Days=? where sID=?");
			q.setParameter(0, s.getsName());
			q.setParameter(1, s.getsType());
			q.setParameter(2, s.getNO_Days());
			q.setParameter(4, s.getsID());
			q.executeUpdate();
			/*ss.saveOrUpdate(s);*/
			ss.beginTransaction().commit();
			System.out.println("daoupdateSubject");
			ss.close();
			sf.close();
			return true;
			}
			catch (Exception e) {
				return false;
			}
	}
	public List<Subject> viewSubject() {
		try {
			Configuration cfg =new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Subject.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			
			Criteria c=ss.createCriteria(Subject.class);
			List<Subject> sList=c.list();
			
			System.out.println("daoViewSubject");
			ss.close();
			sf.close();
			return sList;
			}
			catch (Exception e) {
				return null;
			}
	}
	
	public boolean adminDelete(Subject s) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Subject.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			System.out.println(s.getsID());
			ss.delete(s);
			
			/*String sID=s.getsID();
			Query q=ss.createQuery("delete from Subject where sID=?");
			q.setParameter(0, sID);
			q.executeUpdate();*/
			ss.beginTransaction().commit();
			ss.flush();
			ss.close();
			sf.close();
			return true;
		}
		catch (Throwable e) {
			System.out.println(e);
			return false;
			
		}
		
	}
	public boolean applySub(Subject s, String eID,String eName) {
		try {
			EmpApplied e=new EmpApplied();
			
			Configuration cfg=new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(EmpApplied.class);
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			e.setEmpID(eID);
			e.setEmpName(eName);
			e.setsID(s.getsID());
			e.setsName(s.getsName());
			ss.saveOrUpdate(e);
			
			ss.beginTransaction().commit();
			
			ss.close();
			sf.close();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
		
	public EMPDTO getEmp(String eID) {
		EMPDTO e=null;
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EMPDTO.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from EMPDTO");
		List<EMPDTO> eList=q.list();
		for (EMPDTO empdto : eList) {
			if(empdto.getEmpID().equals(eID))
				e=empdto;
		}
		return e;
	}	
		
	
}
