package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import bean.Client;
import service.ClientService;
import util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ClientService cs=new ClientService();
		Client c= new Client("obelisk", "azerty", "Benlahbib", "Abdessamad", 21, "0621652713", "fes", "maroc");
		cs.addClient(c);
		*/
		
		String hql="FROM Client WHERE user= :user";
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query=session.createQuery(hql);
		query.setParameter("user", "obelisk");
		List result=query.list();
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}

	}

}
