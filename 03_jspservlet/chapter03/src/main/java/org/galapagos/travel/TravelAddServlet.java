package org.galapagos.travel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TravelAddServlet
 */
@WebServlet("/travel_add")
public class TravelAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		String region = request.getParameter("region");
		String title = request.getParameter("title");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String description = request.getParameter("description");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println();
		out.println();
		out.println();
		out.println("</body></html>");
		
	}

}
