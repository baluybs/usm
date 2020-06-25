package com.oehm3.ums.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.service.PasswordService;

@Controller
public class PasswordController {
	@Autowired
	private PasswordService passwordService;
	
	@GetMapping(name= "/changePassword")
	public ModelAndView genarateAndUpdatePassword(HttpServletRequest req) {
		String email=req.getParameter("email");
		RegisterDTO registerDTO=passwordService.getByEmail(email);
		if(registerDTO!=null) {
			RegisterDTO registerDTO2=passwordService.changePassword(registerDTO);
			return new ModelAndView("Login","responseMsg","Passwprd changed Successfully");
		}
		return new ModelAndView("Login","responseMsg","Username Doesnot Exist");
	}
}
