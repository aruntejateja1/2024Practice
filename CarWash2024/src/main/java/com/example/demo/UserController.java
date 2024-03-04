package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Employee;
import com.example.model.User;

@Controller
public class UserController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("index")
	public String index(@ModelAttribute User user) {
		return "index";
	}
	
	/*
	 * @PostMapping("loginUser") public String userLogin(String uname,String upass,
	 * Model model) { if(uname.equals("abc")&&upass.equals("cts")) {
	 * model.addAttribute("name", uname); return "home"; }
	 * model.addAttribute("error", "wrong username or password"); return "index"; }
	 */
	
	@PostMapping("loginUser")
	public String userLogin(@ModelAttribute User user, Model model) {
		if(user.getName().equals("abc")&&user.getPassword().equals("cts")) {
			model.addAttribute("name", user.getPassword());
			return "home";
		}
		model.addAttribute("error", "wrong username or password");
		return "index";
	}
	
	@GetMapping("registerPage")
	public String register(@ModelAttribute Employee employee) {
		
		return "registerPage";
	}
	
	
	@PostMapping("registerUser")
	public String registerPage(@Valid @ModelAttribute Employee employee, BindingResult result,Model model) {

		if (result.hasErrors()) {
			model.addAttribute("error", result.getAllErrors());
			return "registerPage";
		} else {
			try {
				jdbcTemplate.update("insert into employee values(?,?)", employee.getId(), employee.getName());

				return "success";
			} catch (Exception e) { 
				model.addAttribute("error", "This Email Id already exists");

				return "registerPage";
			}
		}

	}
	 
	
	
	/*
	 * @PostMapping("registerUser") public String
	 * registerPage(@Valid @ModelAttribute Employee employee,BindingResult result) {
	 * 
	 * if(result.hasErrors()) { return "registerPage"; }else { return "success"; }
	 * 
	 * }
	 */
}
