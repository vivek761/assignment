package com.yash.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yash.dao.AdminDAO;
import com.yash.dao.UserDAO;

@Controller
public class MainController {
	@Autowired
	AdminDAO admindao;

	@Autowired
	UserDAO usrdao;

	@RequestMapping(value = "/")
	public String first() {
		return "index";
	}

	@GetMapping("/signup")
	public String adminreg(Model m){
		Admin objuser = new Admin();
		m.addAttribute("objuser", objuser);
		return "adminsignup";
	}

	@PostMapping("/SignUpSubmit")
	public String AdminRegSubmit(@ModelAttribute("objuser") Admin objuser) {

		if (admindao.saveadmin(objuser) == 1)
			return "adminlogin";
		else
			return "index";
	}

	@GetMapping("/login")
	public String adminlogin() {
		return "adminlogin";
	}

	@GetMapping("/signin")
	public String Signin(Model m, HttpServletRequest request) {
		String s = request.getParameter("username");
		String p = request.getParameter("password");
		List<Admin> uli = new ArrayList<Admin>();
		uli = admindao.getadmin();
		for (Admin e : uli) {
			if (s.equals(e.getAdminname()) && p.equals(e.getPassword())) {
				m.addAttribute("msg", "you Loged in succesfully");
				return "success";
			}
		}
		m.addAttribute("msg", "you entered wrong credentials");
		return "adminlogin";
	}

	// user signup

	@GetMapping("/usersignup")
	public String userreg(Model m) {
		User objuser = new User();
		m.addAttribute("objuser", objuser);
		return "userreg";
	}

	@PostMapping("/usersubmit")
	public String UserReg(@ModelAttribute("objuser") User objuser, Model m) {

		try {
		if (usrdao.saveuser(objuser) == 1) {
			m.addAttribute("msg", "signup successfull");
			return "userlogin";
		} else {
			return "index";
		}
		}catch(Exception e)
		{
			m.addAttribute("msg", "Email is already exist");
			return "userreg";
		}
	}
	
	@GetMapping("/userlogin")
	public String UsrLogin() {
		return "userlogin";
	}
	
	@GetMapping("/usercheck")
	public String UserLogin(Model m, HttpServletRequest request) {
		String s = request.getParameter("email");
		String p = request.getParameter("password");
		List<User> uli = new ArrayList<User>();
		uli = usrdao.getuser();
		for (User e : uli) {
			if (s.equals(e.getEmail()) && p.equals(e.getPassword())) {
				m.addAttribute("msg", "you Loged in succesfully");
				return "userdashbord";
			}
		}
		m.addAttribute("msg", "you entered wrong credentials");
		return "userlogin";
	}
	
	
	@GetMapping("/viewalluser")
	public String showitem(Model m) {
		List<User> userlist = new ArrayList<User>();
		userlist = usrdao.getuser();
		m.addAttribute("userlist", userlist);
		return "userlist";
	}
	@GetMapping("/searchuser")
	public String searchuser(Model m,HttpServletRequest request) {
		String s = request.getParameter("email");
		List<User> userlist = new ArrayList<User>();
		userlist = usrdao.getuser();
		for (User e : userlist) {
			if (s.equals(e.getEmail())) {
				List<User> ulist = new ArrayList<User>();
				ulist.add(e);
				m.addAttribute("ulist", ulist);
				return "userlist";
			}
		}
		m.addAttribute("msg", "you entered wrong credentials");
		return "userlist";
	}
	@GetMapping("/viewprofile")
	public String Userprofile(@RequestParam String id,Model m) {
		List<User> userlist = new ArrayList<User>();
		userlist = usrdao.viewuser(id);
		m.addAttribute("userlist", userlist);
		return "viewprofile";
	}
	
	@GetMapping("/viewalluseradmin")
	public String showalluser(Model m) {
		List<User> userlist = new ArrayList<User>();
		userlist = usrdao.getuser();
		m.addAttribute("userlist", userlist);
		return "suspenduser";
	}
	
	@GetMapping("/suspend")
	public String deluser(@RequestParam String id, Model m) {
		usrdao.deleteuser(id);
		return "redirect:viewalluseradmin";
	}

}
