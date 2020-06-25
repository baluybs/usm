package com.oehm3.ums.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oehm3.ums.dto.LoginDTO;
import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.dao.LoginDAO;
@Service
public class LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	public RegisterDTO getUserByEmailAndPassword(LoginDTO dto) {
		return loginDAO.getUserByEmailAndPassword(dto);
	}
}
