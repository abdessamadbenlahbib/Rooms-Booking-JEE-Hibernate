package service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.Chambre;
import util.HibernateUtil;

public class ChambreService {
	
	public List<Chambre> getMylist() {
		
		List result=new ArrayList<>();
		String hql="FROM Chambre";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		return  result=query.list();
		
	}
	

}
