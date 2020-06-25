package com.oehm3.ums.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.service.UpdateService;
@Controller
public class UpdateController {
	
	@Autowired
	private UpdateService updateService;
	
	@PostMapping(value = "/update")
	public ModelAndView update(RegisterDTO registerDTO,HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		RegisterDTO dto=(RegisterDTO) session.getAttribute("registerDTO");
		registerDTO.setId(dto.getId());
		System.out.println(registerDTO);
		RegisterDTO updatedData=updateService.update(registerDTO);
		session.setAttribute("registerDTO", updatedData);
		return new ModelAndView("home","responseMsg",updatedData.getName());
	}
}
