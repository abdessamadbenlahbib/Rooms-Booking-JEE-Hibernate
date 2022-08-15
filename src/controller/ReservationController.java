package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Reservation;
import service.ReservationService;

@WebServlet("/reservation")

public class ReservationController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ReservationService rs=new ReservationService();
		String user,numroom,fullname,phone,street,city,country,nationality;
		Date reservationdate,reservationend;
		int reservationperiod,prix,numberperson;
		java.util.Date reservationstart;
		
		try {
		user=req.getParameter("user");
		numroom=req.getParameter("numroom");
		fullname=req.getParameter("fullname");
		phone=req.getParameter("phone");
		street=req.getParameter("street");
		city=req.getParameter("city");
		country=req.getParameter("country");
		nationality=req.getParameter("nationality");
		reservationdate=new Date(Calendar.getInstance().getTime().getTime());
		reservationstart=new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("reservstart"));
		
		if(checkdate(reservationdate,reservationstart)==false)
		{
			resp.sendRedirect("errordate");
		}
		else
		{
		reservationperiod=Integer.parseInt(req.getParameter("reservperiod"));
		reservationend=addDay(reservationstart, reservationperiod);
		
		if(rs.isReserved(numroom, reservationstart, reservationend)==true)
			{
				req.setAttribute("numroom", numroom);
				req.getServletContext().getRequestDispatcher("/isreserved.jsp").forward(req, resp);
				
			}
		else
			{
				prix=getPrice(req.getParameter("prix")) * reservationperiod;
				numberperson=Integer.parseInt(req.getParameter("numberperson"));
				Reservation r=new Reservation(user, numroom, fullname, phone, street, city, country, nationality, reservationdate, reservationstart,reservationend ,reservationperiod, prix, numberperson);
				rs.add(r);
				resp.sendRedirect("main");
			}
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			resp.sendRedirect("error");
		}
		
		
		
	}
	
	public Date addDay(java.util.Date date,int days)
	{
		Date newdate;
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR,days);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		newdate=new Date(cal.getTimeInMillis());
		return newdate;
	}
	
	public int getPrice(String str)
	{
		StringTokenizer st=new StringTokenizer(str," ");
		String temp=st.nextToken();
		return Integer.parseInt(temp);
	}
	
	
	public boolean checkdate(Date date1,java.util.Date date2)
	{
		if(date1.compareTo(date2) > 0)
		{
			return false;
		}
		return true;
	}

}
