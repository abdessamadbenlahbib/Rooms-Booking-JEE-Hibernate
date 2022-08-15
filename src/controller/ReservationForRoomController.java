package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Reservation;
import service.ReservationService;

@WebServlet("/roomreservation")

public class ReservationForRoomController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Reservation> liste=new ArrayList<>();
		ReservationService ro=new ReservationService();
		String numroom=req.getParameter("numroom");
		liste=ro.getResrvationListForRoom(numroom);
		req.setAttribute("roomreservationliste", liste);
		this.getServletContext().getRequestDispatcher("/reservationForRoom.jsp").forward(req, resp);
	}

}
