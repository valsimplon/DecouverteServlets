package co.simplon.poleEmploi.decouverteServlets;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.simplon.annuaire.domain.Hobby;
import co.simplon.annuaire.domain.Utilisateur;

public class CreerContact extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// construction d'un request dispatcher sur le chemin hello.jsp, qui
		// doit exister
		// dans la web application courante
		
		HashSet<Hobby> setHobby = new HashSet<Hobby>();
		setHobby.add(new Hobby("Guitar", 1));
		setHobby.add(new Hobby("Cinema", 1));
		setHobby.add(new Hobby("Gym", 1));
		
		String nom = "";
		String prenom = "";
		String email = "";
		String contact_type = "";
		int age = 0;
		
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("affichContact.jsp");

		if (request.getParameter("nom") != null
				&& !request.getParameter("nom").isEmpty()) {
			 nom = request.getParameter("nom");
		}
		if (request.getParameter("prenom") != null
				&& !request.getParameter("prenom").isEmpty()) {
			prenom = request.getParameter("prenom");
		}
		if (request.getParameter("email") != null
				&& !request.getParameter("email").isEmpty()) {
			email = request.getParameter("email");
		}
		if (request.getParameter("contact_type") != null
				&& !request.getParameter("contact_type").isEmpty()) {
			contact_type = request.getParameter("contact_type");
		}
		if (request.getParameter("age") != null
				&& !request.getParameter("age").isEmpty()) {
			age = Integer.parseInt(request.getParameter("age"));
		}
		 
		Utilisateur nouveauContact = new Utilisateur(prenom, nom, email,
				contact_type, age, setHobby);
		
//		request.setAttribute("lePrenom", nouveauContact.getFname().toUpperCase());
//		request.setAttribute("leNom", nouveauContact.getLname().toUpperCase());
//		request.setAttribute("lEmail", nouveauContact.getEmail().toLowerCase());
//		request.setAttribute("leContact_type", nouveauContact.getContactType());
//		request.setAttribute("lAge", nouveauContact.getAge());
		request.setAttribute("nouveauContact", nouveauContact);
		requestDispatcher.forward(request, response);
	}

}
