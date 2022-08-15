package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Reservation;
import service.ReservationService;

@WebServlet("/mesreservations")

public class MesReservationsRedirect extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user;
		HttpSession session=req.getSession();
		user=(String)session.getAttribute("USER");
		if(user==null)
		{
			resp.sendRedirect("main");
		}
		else
		{
			ReservationService rs=new ReservationService();
			List<Reservation> list=new ArrayList<>();
			list=rs.getMylist(user);
			req.setAttribute("maliste", list);
			this.getServletContext().getRequestDispatcher("/mesReservations.jsp").forward(req, resp);
		}
		
	}

}
