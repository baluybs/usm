package com.oehm3.ums.model.service;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.dao.PasswordDAO;
import com.oehm3.ums.model.dao.UpdateDAO;

@Service
public class PasswordService {
	@Autowired
	private PasswordDAO passwordDAO;
	
	@Autowired
	private UpdateDAO updateDAO;
	
	public RegisterDTO getByEmail(String email) {
		return passwordDAO.getByEmail(email);
	}
	
	public RegisterDTO changePassword(RegisterDTO registerDTO) {
		Random random=new Random();
		String newPassword=String.format("%04d", random.nextInt(1001));
		registerDTO.setPassword(newPassword);
		return updateDAO.update(registerDTO);
	}
}
