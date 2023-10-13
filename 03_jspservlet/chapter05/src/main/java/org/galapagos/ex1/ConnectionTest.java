package org.galapagos.ex1;

import java.io.IOException;
import java.sql.Connection;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ConnectionTest
 */
@WebServlet("/test")
public class ConnectionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/mysql")
	DataSource datafactory;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try(Connection con = datafactory.getConnection()) {
			System.out.println("연결 획득 성공");
		} catch (Exception e) {
			e.printStackTrace();
		};
	
	}

}
