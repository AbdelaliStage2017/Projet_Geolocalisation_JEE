package com.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.Beans.Chercheur;

public class ChercheurDAO extends DAO<Chercheur> {

	public ChercheurDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Chercheur obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.getNom());
		try {
			this.connect.createStatement().executeUpdate("INSERT INTO chercheur(`NOM`,`Prenom`,`Date_naissance`,`Telephone`,`Email`,`Type`,`id_labo`,`password`) values ('"+obj.getNom()+"','"+obj.getPrenom()+"',"+obj.getDate_naissance()+",'"+obj.getTelephone()+"','"+obj.getEmail()+"','"+obj.getType()+"','"+obj.getIdLabo()+"','"+obj.getPassword()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
		return true;
	}

	@Override
	public boolean delete(Chercheur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Chercheur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Chercheur find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
