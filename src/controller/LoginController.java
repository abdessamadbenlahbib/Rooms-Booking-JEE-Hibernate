package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.ClientService;



@WebServlet("/logincheck")

public class LoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ClientService cs=new ClientService();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		if(cs.getClientlist(username, password).size() != 0)
		{
			HttpSession session=req.getSession();
			session.setAttribute("USER", username);
			resp.sendRedirect("main");
		}
		else
		{
			resp.sendRedirect("login");
		}
		
	}

}
