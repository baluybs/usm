package com.oehm3.ums.model.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.oehm3.ums.dto.RegisterDTO;

@Repository
public class UpdateDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public RegisterDTO update(RegisterDTO registerDTO) {
		System.out.println("inside dao");
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		RegisterDTO dto=(RegisterDTO) session.merge(registerDTO);
		transaction.commit();
		return dto;
		}
}
