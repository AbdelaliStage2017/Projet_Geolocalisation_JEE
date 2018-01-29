package com.Services;


import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import com.Beans.Adresse;
import com.DAO.ChercheurDAO;
import com.DAO.DAOFactory;
public class FindService {

	public static 	ResultSet	recherche (HttpServletRequest request) {
		
		String searchInput=request.getParameter("search");
		String type=request.getParameter("type");
		
		switch(type) {
		
		case "1":{
			
			ChercheurDAO chDAO=new DAOFactory().getChercheurDAO();
			
			
			break;
		}
		case "2":{
			
			break;
		}
		
		case "3":{
			
			break;
		}
		}
		
		
	}
	
	
}
