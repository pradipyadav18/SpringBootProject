package in.sp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.beans.Student;
import in.sp.main.dao.RegisterDao;
import in.sp.main.service.LoginService;
import in.sp.main.service.RegisterService;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class MyController {
	
	
//	@RequestMapping("/")
//	public String openIndexPage() {
//		return"index";
//	}
	
	@RequestMapping("/")
	public String openHomePage() {
		return "home-page";
	}
	
	
	
	
	
	@RequestMapping("homePage")
	public String openHome() {
		return "home-page";
	}

	
	@GetMapping("/aboutUsPage")
	public String openAboutPage() {
		
		return "about-us-page";
	}
	
	
	@GetMapping("/contactUsPage")
	public String openContactUsPage() {
		
		return "contact-us-page";
	}
	
	
	@GetMapping("/LoginPage")
	public String openLoginPage() {
		
		return "login-page";
	}
	
	
	@GetMapping("/registerPage")
	public String openRegisterPage() {
		
		return "register-page";
	}
	
	
	@Autowired
	LoginService loginservice;
	
	
	@PostMapping("/LoginForm")
	public String openLoginPage(@RequestParam("email1")  String email , @RequestParam("pass1") String password , HttpSession session , Model model) {
		
		String page="error-page";
		 
		
	List<Student>student_list=loginservice.loginService(email, password);
	
	if(student_list.size() != 0) {
		//model.addAttribute("student",student_list.get(0));
		
		session.setAttribute("session_name", student_list.get(0).getName());
		session.setAttribute("session_email", student_list.get(0).getEmail());
		session.setAttribute("session_gender", student_list.get(0).getGender());
		session.setAttribute("session_city", student_list.get(0).getCity());
		session.setAttribute("session_password", student_list.get(0).getPassword());

		
		
		
		
		
		page="profile-page";
	}else {
		
		
		
		model.addAttribute("model_message","Email id and password didn't matched");
		model.addAttribute("model_pagename" , "login");
		
		
		page="error-page";
		
	}
	
	return page;

	}
	
	
	@GetMapping("/profilePage")
	public String openProfilePage() {
		return "profile-page";
		
	}
	
	@GetMapping("/logout")
	public String openLogoutPage(HttpSession session) {
		session.invalidate();
		return "login-page";
	}
	
	
	@Autowired
	RegisterService registerservice;
	
	
	@PostMapping("/regForm")
	public String register( @RequestParam("name1") String name , @RequestParam("email1") String email ,  @RequestParam(name="gender1" , required=false) String gender ,  @RequestParam("pass1") String password , @RequestParam("city1") String city , HttpSession session , Model model) {
		
		String page="error-page";
		
		Student st=new Student();
		st.setName(name);
		st.setCity(city);
		st.setEmail(email);
		st.setPassword(password);
		st.setGender(gender);
		
		
	     boolean ans=registerservice.registerService(st);
		
		if(ans) {
			
			
			model.addAttribute("model_message","Student Register Succcessfully");
			model.addAttribute("model_pagename" , "register");
			
			page="success-page";

			
//			session.setAttribute("session_name", st.getName());
//			session.setAttribute("session_email", st.getEmail());
//			session.setAttribute("session_password", st.getPassword());
//			session.setAttribute("session_city", st.getCity());
//			session.setAttribute("session_gender", st.getGender());
//			
	
		}else {
			
			model.addAttribute("model_message","Student  not Register due to some error");
			model.addAttribute("model_pagename" , "register");
			
			
			
			
			page="error-page";
		}

		
		return page;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
