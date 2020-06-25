package com.oehm3.ums.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm3.ums.dto.LoginDTO;
import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.service.LoginService;
@Controller
public class LoginController {
	
	@Autowired
	public LoginService loginService;
	@PostMapping(name = "/Login")
	public ModelAndView isValidUser(LoginDTO loginDTO,HttpServletRequest req) {
		RegisterDTO registerDTO=loginService.getUserByEmailAndPassword(loginDTO);
		if(registerDTO!=null) {
			HttpSession session=req.getSession();
			session.setAttribute("registerDTO", registerDTO);
			return new ModelAndView("home","responseMsg",registerDTO.getName());
		}else {
			return new ModelAndView("Login","responseMsg","Invalid Credentials");
		}
	}
}
