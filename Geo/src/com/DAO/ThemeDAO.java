package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Beans.Theme;

public class ThemeDAO extends DAO<Theme> {

	public ThemeDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Theme obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Theme obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Theme obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Theme find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultSet find2(String titre) {
		ResultSet rs;
		try {
		
			PreparedStatement preparedStatement = connect.prepareStatement("select * from theme,these,these_theme,lieu_recheche,lieu "
					+ "where theme.id_theme=these_theme.id_theme "
					+ "and these_theme.id_these=these.id_these"
					+ "and these.id_these=lieu_recherche.id_these"
					+ "and lieu_recherche.id_adresse=lieu.id_adresse"
					+ "and  (  theme.nom like concat('%', replace(?,' ' ,'%'), '%'))  ");

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
