package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {

	private String message;

	public void init() throws ServletException {

		message = "Hello ";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String nom_ = request.getParameter("NOM");

		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + nom_ + "</h1>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// construction d'un request dispatcher sur le chemin hello.jsp, qui
		// doit exister
		// dans la web application courante
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/WEB-INF/hello.jsp");

		// redirection de la requête vers cette ressource
		String nom = "world";
		if (request.getParameter("NOM") != null
				&& !request.getParameter("NOM").isEmpty()) {
			nom = request.getParameter("NOM");
		}
		request.setAttribute("leNom", nom.toUpperCase());
		requestDispatcher.forward(request, response);

		// cette servlet perd la main pour le traitement de la requête courante
	}

	/*
	 * public void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * response.setContentType("text/html");
	 * 
	 * nom = request.getParameter("NOM");
	 * 
	 * PrintWriter out = response.getWriter(); out.println("<h1>" + message +
	 * nom + "</h1>"); }
	 */

	public void destroy() {
		// do nothing.
	}
}
