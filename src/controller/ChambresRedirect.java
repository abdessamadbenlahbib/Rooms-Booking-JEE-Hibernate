package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Chambre;
import service.ChambreService;


@WebServlet("/chambres")

public class ChambresRedirect extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ChambreService cs=new ChambreService();
		List<Chambre> list=new ArrayList<>();
		list=cs.getMylist();
		req.setAttribute("maliste", list);
		this.getServletContext().getRequestDispatcher("/chambres.jsp").forward(req, resp);
	}

}
