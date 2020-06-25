package com.oehm3.ums.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oehm3.ums.dto.RegisterDTO;
import com.oehm3.ums.model.dao.UpdateDAO;

@Service
public class UpdateService {
	
	@Autowired
	private UpdateDAO updateDAO;
	
	public RegisterDTO update(RegisterDTO registerDTO) {
		System.out.println("inside service");
		return updateDAO.update(registerDTO);
	}
}
