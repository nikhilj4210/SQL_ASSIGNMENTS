package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class HelloController {
	@Autowired
	AdditionInterface addtion;
	
	@RequestMapping("/hello")
    public String sayHello(Model model) {      
		int r = addtion.add(0, 0);
        model.addAttribute("msg", r);       
        return "hello";
    }
	
	@RequestMapping("/contactlist")
	public ModelAndView getContact() {
		
		ModelAndView mav = new ModelAndView("contact");
		mav.addObject("contact", "ganesh.bm@sonata-software.com");
		
		return mav;
	}
	
	@RequestMapping("/login")
	public String validateUser(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {
		model.addAttribute("username", username);
		return "home";
	}
	
	@RequestMapping("/index")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/path/{empid}/{empname}")
	public String pathVarDemo(@PathVariable int empid,@PathVariable String name, Model model) {
		model.addAttribute("empid", empid);
		return "path";
	}
}
