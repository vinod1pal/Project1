package com.zeus.Educare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ServletForwardingController;

import com.zeus.Educare.model.Admin;
import com.zeus.Educare.model.EMPDTO;
import com.zeus.Educare.model.Subject;
import com.zeus.Educare.services.services;

@RequestMapping(value="/")
@Component
public class controllerdemo {
	
	/*@Autowired
	services s;
	*/
	
	
	@RequestMapping(value="/login")//, method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String usn,@RequestParam String pwd)/*,HttpServletRequest request,HttpServletResponse response)*/ throws ServletException, IOException{
		
		/*PrintWriter out=resp.getWriter();
		RequestDispatcher dispatch=null;*/
		
		services s=new services();
		EMPDTO e=s.verifyService(usn, pwd);
		Admin a=s.verfiyAdminService(usn, pwd);
		if(e!=null) {
			System.out.println("E!=null");
			return new ModelAndView("EmpHome","EmpDTO",e);
		}
		
		if(a!=null)
			{
				System.out.println("A!=null");
				return new ModelAndView("AdminHome","aDTO",a);
			}
		
				/*out.println("<h1><font style:color=red>INVALID Username or Password</h1></font><br><h2>Try Again!!!!</h2>");
				dispatch=req.getRequestDispatcher("Index");
				dispatch.include(req, resp);*/
		
		/*RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
		rd.include(request, response);
		*/
		
		
		
		return new ModelAndView("error");
	}
	
	
	@RequestMapping(value="/signup")
	public String signup() {
		
		
		
		return "register";
	}
	
	@RequestMapping(value="/reg")
	public String register(@ModelAttribute EMPDTO empdto){
			services s=new services();
			
			System.out.println("controller :"+empdto);
			
			boolean flag=s.regService(empdto);
			if(flag) {
				return "regDone";
			}
			else {
				return "regError";
			}
		
		
	}
	@RequestMapping(value="/regAdmin")
	public String registerAdmin(@ModelAttribute Admin ad) {
		services s=new services();
		System.out.println("regAdmin");
		boolean fg=s.regAdminService(ad);
		if(fg)
		return "regDone";
		else
		return "regError";
	}
	@RequestMapping(value="/add")
	public String adminAdd() {
		return "AdminAddSubject";
	}
	
	@RequestMapping(value="/addSubject")
	public String adminAddSubject(@ModelAttribute Subject s,HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		services s1=new services();
		PrintWriter out=resp.getWriter();
		RequestDispatcher d=null;
		boolean fg=s1.addSubjectService(s);
		if(fg)
		{
			/*out.println("<h1>Subject Added Successfully!!!</h1>");
			req.getRequestDispatcher("/WEB-INF/view/AdminAddSubject.jsp").forward(req, resp);
			d=req.getRequestDispatcher("/WEB-INF/view/AdminAddSubject.jsp");
			d.include(req, resp);*/
			
			return "addSuccess";
		}
		else 
		{
			/*out.println("<h1>Error Occurred</h1><br>Try Again!!!");
			d=req.getRequestDispatcher("/WEB-INF/view/AdminAddSubject.jsp");
			d.include(req, resp);*/
			
			return "errorSubAdd";
		}
		
		
	}
	@RequestMapping(value="/adminhome")
	public String adminhome() {
		
		return "AdminHome";
	}
	
	@RequestMapping(value="/backaddsub")
	public String backAddSubject() {
		
		return "AdminAddSubject";
	}
	@RequestMapping(value="/view")
	public ModelAndView adminViewSubject() {
		services s1=new services();
		List<Subject> s=s1.viewSubjectService();
		
		
		return new ModelAndView("adminView","sList",s);
	}
	
	@RequestMapping(value="/viewSub")
	public ModelAndView empView() {
		services s1=new services();
		List<Subject> s=s1.viewSubjectService();
		return new ModelAndView("EmpView","sList",s);
	}
	
	
	
	@RequestMapping(value="/update")
	public ModelAndView adminUpdateSubject() {
		services s1=new services();
		List<Subject> s=s1.viewSubjectService();
		System.out.println(s);
		return new ModelAndView("adminUpdateView","sList",s);
	}
	
	
	
	
	@RequestMapping(value="/modify")
	public ModelAndView adminUpdate(@ModelAttribute Subject s) {
		System.out.println(s);
		return new ModelAndView("AdminAddSubject","sub",s);
	}
	
	@RequestMapping(value="/deleteView")
	public ModelAndView adminDeleteSubject() {
		System.out.println("Controller adminDeleteSubject()");
		services s1=new services();
		List<Subject> s=s1.viewSubjectService();
		
		return new ModelAndView("AdminDeleteView","sList",s);
	}
	@RequestMapping(value="/delete")
	public ModelAndView adminDelete(@ModelAttribute Subject s) {
		services s1=new services();
		services s2=new services();
		List<Subject> sub=null;
		boolean fg=s1.adminDeleteService(s);
		if(fg) {
			sub=s2.viewSubjectService();
			return new ModelAndView("AdminDeleteView","sList",sub);
		}
		else {
			return new ModelAndView("errorDelete");
		}
		
	}
	
	@RequestMapping(value="apply")
	public String appliedSub(@ModelAttribute Subject s,@RequestParam String empID,@RequestParam String empName) {
		services s1=new services();
		boolean fg=s1.applySubService(s, empID, empName);
		if(fg){
			return "appSuccess";
		}
		else {
			return "appError";
		}
		
	}
	@RequestMapping(value="/emphome")
	public String backApplySub() {
		return "EmpHome";
	}
	
	
	@RequestMapping(value="/logout")
	public String logOut() {
		return "Index";
	}
	
	@RequestMapping(value="/manageView")
	public ModelAndView manageEmpView(@RequestParam String eID) {
		services s=new services();
		System.out.println(eID);
		EMPDTO e=s.getEmpService(eID);
		return new ModelAndView("register","eDTO",e);
	}
	@RequestMapping(value="/manage")
	public ModelAndView manageAcc(@ModelAttribute EMPDTO e) {
		services s=new services();
		boolean fg=s.regService(e);
		if(fg)
		{
			return new ModelAndView("updateDone");
		}
		else {
			return new ModelAndView("updateError","eDTO",e);
		}
	}
}
