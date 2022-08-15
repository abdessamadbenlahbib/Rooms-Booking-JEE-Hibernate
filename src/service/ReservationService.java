package service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.Reservation;
import util.HibernateUtil;

public class ReservationService {
	
	public void add(Reservation r)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(r);
		session.getTransaction().commit();
		//session.close();
	}
	
	
	public List<Reservation> getMylist(String user) {
		List result=new ArrayList<>();
		String hql="FROM Reservation WHERE user= :user";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("user", user);
		return  result=query.list();
	}
	
	public List<Reservation> getResrvationListForRoom(String numroom) {
		
		List result=new ArrayList<>();
		String hql="FROM Reservation WHERE numroom= :numroom";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("numroom", numroom);
		return  result=query.list();
		
	}
	
	public boolean isReserved(String numroom,java.util.Date datestart,Date dateend)
	{
		List result=new ArrayList<>();
		//System.out.println(numroom);
		String hql="FROM Reservation where numroom= :numroom and ( :datestart between reservationstart and reservationend or :dateend between reservationstart and reservationend )";
		//String sql="SELECT * FROM reservation where NUM_ROOM= :numroom and :datestart between RESERVATION_START and RESERVATION_END or :dateend between RESERVATION_START and RESERVATION_END";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		// query=session.createSQLQuery(sql);
		query.setString("numroom", numroom);
		query.setParameter("datestart", datestart);
		query.setParameter("dateend", dateend);
		result=query.list();
		if(result.size() !=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
