package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.Beans.Adresse;
import com.Beans.Universite;

public class UniversiteDAO extends DAO<Universite> {

	public UniversiteDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Universite obj) {
		// TODO Auto-generated method stub
		try {
			 Adresse adresse= obj.getAdresse();
			Statement stmt=this.connect.createStatement();
			stmt.executeUpdate("INSERT INTO lieu(`Latitude`,`Longitude`) values("+adresse.getLatitude()+","+adresse.getLatitude()+")",Statement.RETURN_GENERATED_KEYS);
			ResultSet rs=stmt.getGeneratedKeys();
			int id_adresse=0;
			while (rs.next()) {
				  id_adresse = rs.getInt(1);                                       
				}
				rs.close();
				
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				String date=formatter.format(obj.getDateCreation());
				
			stmt.executeUpdate("INSERT INTO universite(`nom`,`Description`,`Date_creation`,`id_adresse`) values('"+obj.getNom()+"','"+obj.getDescription()+"','"+date+"',"+id_adresse+")");	
				
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(Universite obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Universite obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public ResultSet getAll() {
		// TODO Auto-generated method stub
		Statement stmt;
		ResultSet rs;
		try {
			stmt = this.connect.createStatement();
			rs=stmt.executeQuery("select * from universite");
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Universite find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
