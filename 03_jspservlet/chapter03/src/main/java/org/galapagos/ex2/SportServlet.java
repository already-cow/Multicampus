package org.galapagos.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SportServlet
 */
@WebServlet("/Sport")
public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String [] sports = request.getParameterValues("sports");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		Integer numAge;
		if (age != null && !age.isEmpty()) {
			numAge = Integer.parseInt(age);
		} else {
			numAge = null;
		}
		
		out.print("<html><body>");
		if(sports != null){
		for (String sport : sports) {
			out.print("좋아하는 운동: " + sport + "<br>");
		}
		} else {
			out.println("좋아하는 운동 : 없음<br>");
		}
		out.print("성별 : " + sex + "<br>");
		
		out.print("나이 : " + numAge + "<br>");
		out.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
