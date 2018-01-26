package com.Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import com.Beans.Adresse;
import com.Beans.Chercheur;
import com.Beans.Departement;
import com.Beans.Laboratoire;
import com.Beans.Universite;
import com.DAO.ChercheurDAO;
import com.DAO.DAOFactory;
import com.DAO.DepartementDAO;
import com.DAO.LaboratoireDAO;
import com.DAO.UniversiteDAO;

public  class Ajout {

	
	public static void AjouterUser(HttpServletRequest request) {
		
			Chercheur chercheur= new Chercheur();
			chercheur.setNom(request.getParameter("name"));
			chercheur.setPrenom(request.getParameter("prenom"));
			chercheur.setEmail(request.getParameter("email"));
			chercheur.setTelephone(request.getParameter("tel"));
			chercheur.setPassword(request.getParameter("password"));
			chercheur.setIdLabo(Integer.parseInt(request.getParameter("labo")));
			
			ChercheurDAO chDAO=new DAOFactory().getChercheurDAO();
			chDAO.create(chercheur);
			
	}
	
	public static void AjouterUniversite(HttpServletRequest request) {
		
		Universite universite= new Universite();
		universite.setNom(request.getParameter("name"));
		universite.setDescription(request.getParameter("description"));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			universite.setDateCreation(formatter.parse(request.getParameter("date")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Adresse adresse= new Adresse();
		if(request.getParameter("lantitude").isEmpty())
		{
			adresse.setLatitude(0.0);
			adresse.setLongtitude(0.0);
		}
		else
		{
		adresse.setLatitude(Double.parseDouble(request.getParameter("lantitude")));
		adresse.setLongtitude(Double.parseDouble(request.getParameter("longitude")));
		
		}
		universite.setAdresse(adresse);
		UniversiteDAO uniDAO=new DAOFactory().getUniversiteDAO();
		uniDAO.create(universite);
		
}

	public static void AjouterDepartement(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Departement departement= new Departement();
		departement.setNom(request.getParameter("name"));
		departement.setDescription(request.getParameter("description"));
		departement.setSpecialisation(request.getParameter("specialisation"));
		departement.setId_universite(Integer.parseInt(request.getParameter("universite")));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
			departement.setDateCreation(formatter.parse(request.getParameter("date")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Adresse adresse= new Adresse();
		if(request.getParameter("lantitude").isEmpty())
		{
			adresse.setLatitude(0.0);
			adresse.setLongtitude(0.0);
		}
		else
		{
		adresse.setLatitude(Double.parseDouble(request.getParameter("lantitude")));
		adresse.setLongtitude(Double.parseDouble(request.getParameter("longitude")));
		
		}
		departement.setAdresse(adresse);
		DepartementDAO depDAO=new DAOFactory().getDepartementDAO();
		depDAO.create(departement);
	}
	
	
	public static void AjouterLaboratoire(HttpServletRequest request) {
		// TODO Auto-generated method stub
		Laboratoire laboratoire = new Laboratoire();
		laboratoire.setNom(request.getParameter("name"));
		laboratoire.setDescription(request.getParameter("description"));
		laboratoire.setDomaine(request.getParameter("domaine"));
		laboratoire.setId_departement(Integer.parseInt(request.getParameter("departement")));
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
			laboratoire.setDateCreation(formatter.parse(request.getParameter("date")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Adresse adresse= new Adresse();
		if(request.getParameter("lantitude").isEmpty())
		{
			adresse.setLatitude(0.0);
			adresse.setLongtitude(0.0);
		}
		else
		{
		adresse.setLatitude(Double.parseDouble(request.getParameter("lantitude")));
		adresse.setLongtitude(Double.parseDouble(request.getParameter("longitude")));
		
		}
		laboratoire.setAdresse(adresse);
		LaboratoireDAO labDAO=new DAOFactory().getLaboratoireDAO();
		labDAO.create(laboratoire);
	}
	
	
}
