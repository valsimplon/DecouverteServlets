package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	
	private String message;
	public String nom;

	public void init() throws ServletException {

		message = "Hello ";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");

		nom = request.getParameter("NOM");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message +  nom + "</h1>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");

		nom = request.getParameter("NOM");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message +  nom + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}
}
