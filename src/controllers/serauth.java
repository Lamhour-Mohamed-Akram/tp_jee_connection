package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Personne;
import dao.personne.daopersonne;

public class serauth extends HttpServlet {
	 
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	PrintWriter out = resp.getWriter();
	daopersonne daop = new daopersonne() ;
	Personne p = new Personne(req.getParameter("login"), req.getParameter("nom"), req.getParameter("prenom"), req.getParameter("adresse"), req.getParameter("password"));
	int res = 0; 
	try {
		res= daop.modifierpersonne(p);
	} catch (Exception e) {
		e.printStackTrace();
	}
	if (res==0) {
		out.print("erreur");
	}
	else {
	out.print("bien ajouter");
	}
	}
}
