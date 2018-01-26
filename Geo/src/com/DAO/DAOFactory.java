package com.DAO;

import java.sql.Connection;

import com.Services.Conn;

public class DAOFactory {
	protected static final Connection conn = Conn.getConn();   


	  public ChercheurDAO getChercheurDAO(){

	    return new ChercheurDAO(conn);

	  }
	  
	  public UniversiteDAO getUniversiteDAO(){

		    return new UniversiteDAO(conn);

		  }

	  public DepartementDAO getDepartementDAO(){

		    return new DepartementDAO(conn);

		  }
	  
	  public LaboratoireDAO getLaboratoireDAO(){

		    return new LaboratoireDAO(conn);

		  }
	 
}
