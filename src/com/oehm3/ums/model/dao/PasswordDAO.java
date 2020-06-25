package com.oehm3.ums.model.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oehm3.ums.dto.RegisterDTO;

@Repository
public class PasswordDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public RegisterDTO getByEmail(String email) {
		RegisterDTO dto=null;
		Session session=sessionFactory.openSession();
		String hql="from RegisterDTO where email=:newEmail";
		try {
			Query query=session.createQuery(hql);
			query.setParameter("newEmail", email);
			dto=(RegisterDTO) query.uniqueResult();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
}
