package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Beans.These;

public class TheseDAO extends DAO<These> {

	public TheseDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(These obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(These obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(These obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public These find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ResultSet find2(String titre) {
		ResultSet rs;
		try {
		
			PreparedStatement preparedStatement = connect.prepareStatement("select * from these,lieu_recheche,lieu "
					+ "and these.id_these=lieu_recherche.id_these"
					+ "and lieu_recherche.id_adresse=lieu.id_adresse"
					+ "and  (  these.titre like concat('%', replace(?,' ' ,'%'), '%'))  ");

			preparedStatement.setString( 1,titre );
			
			rs=preparedStatement.executeQuery();
			
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}

}
