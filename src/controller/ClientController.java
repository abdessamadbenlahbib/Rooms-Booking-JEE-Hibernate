package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Client;
import service.ClientService;

@WebServlet("/client")

public class ClientController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ClientService cs=new ClientService();
		String user,password,nom,prenom,tel,nationalite,adresse;
		int age;
		try{
		user=req.getParameter("username");
		password=req.getParameter("password");
		nom=req.getParameter("nom");
		prenom=req.getParameter("prenom");
		tel=req.getParameter("telephone");
		adresse=req.getParameter("adresse");
		nationalite=req.getParameter("nationalite");
		age=Integer.parseInt(req.getParameter("age"));
		Client c=new Client(user, password, nom, prenom, age, tel, adresse, nationalite);
		if(cs.isExistClient(c.getUser()))
		{
			this.getServletContext().getRequestDispatcher("/registeruseralreadyexist.jsp").forward(req, resp);
		}
		else
		{
			cs.addClient(c);
			resp.sendRedirect("main");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp.sendRedirect("error");
		}
		
	}

}
