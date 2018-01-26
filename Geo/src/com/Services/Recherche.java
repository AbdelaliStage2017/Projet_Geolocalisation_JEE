package com.Services;

import java.sql.ResultSet;
import java.util.List;

import com.DAO.DAOFactory;
import com.DAO.DepartementDAO;
import com.DAO.UniversiteDAO;

public class Recherche {
	
	public static ResultSet listUniversite() {
		
		UniversiteDAO unidao= new DAOFactory().getUniversiteDAO();
		        
		return unidao.getAll();
	}
	
public static ResultSet listDepartement(int id_universite) {
		
		DepartementDAO depdao= new DAOFactory().getDepartementDAO();
		        
		return depdao.getAll(id_universite);
	}
	
	
	

}
