package com.oehm3.ums.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.dao.RegisterDAO;

@Service
public class RegisterService {
	@Autowired
	private RegisterDAO registerDAO;
	public void register(RegisterDTO dto) {
		registerDAO.register(dto);
	}
}
