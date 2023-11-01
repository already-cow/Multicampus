package org.galapagos.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cartsave")
public class CartSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF8");
		PrintWriter out = response.getWriter();
		
		String product = request.getParameter("product");
		System.out.println(product);

		HttpSession session = request.getSession();
		ArrayList<String> list = (ArrayList<String>) session.getAttribute("product");

		if (list == null) {
			list = new ArrayList<String>();
			list.add(product);
			session.setAttribute("product", list);
		} else {
			list.add(product);
		}
		out.print("<html><body>");
		out.print("Product 추가");
		out.print("<a href='cartbasket'>장바구니 보기</a>");
		out.print("</body></html>");

	}

}
