package service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.Client;
import util.HibernateUtil;

public class ClientService {
	
	public void addClient(Client c)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		
	}
	
	public boolean isExistClient(String user)
	{
		String hql="FROM Client WHERE user= :user";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("user", user);
		List result=query.list();
		if(result.size()==0)
		{
			return	false;
		}
		else
		{
			return	true;
		}
		
		
	}
	
	public List<Client> getClientlist(String username,String password)
	{
		List result=new ArrayList<>();
		String hql="FROM Client WHERE user= :username and password= :password";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("username", username);
		query.setParameter("password", password);
		return  result=query.list();
	
	}

}
