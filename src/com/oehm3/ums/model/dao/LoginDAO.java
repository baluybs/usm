package com.oehm3.ums.model.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.oehm3.ums.dto.LoginDTO;
import com.oehm3.ums.dto.RegisterDTO;
@Repository
public class LoginDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public RegisterDTO getUserByEmailAndPassword(LoginDTO dto) {
		RegisterDTO registerDTO=null;
		Session session=sessionFactory.openSession();
		String hql="from RegisterDTO where email=:newEmail and password=:newPassword";
		Query query=session.createQuery(hql);
		query.setParameter("newEmail", dto.getEmail());
		query.setParameter("newPassword",dto.getPassword());
		try {
			registerDTO=(RegisterDTO) query.uniqueResult();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return registerDTO;
	}
}
