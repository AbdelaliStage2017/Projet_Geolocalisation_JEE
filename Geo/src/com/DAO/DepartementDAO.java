package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.Beans.Adresse;
import com.Beans.Departement;

public class DepartementDAO extends DAO<Departement> {

	public DepartementDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Departement obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.getNom());
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
				
			stmt.executeUpdate("INSERT INTO Departement(`nom`,`specialisation`,`Description`,`Date_creation`,`id_universite`,`id_adresse`) values('"+obj.getNom()+"','"+obj.getSpecialisation()+"','"+obj.getDescription()+"','"+date+"',"+obj.getId_universite()+","+id_adresse+")");	
				
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(Departement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Departement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public ResultSet getAll(int id_universite) {
		// TODO Auto-generated method stub
		Statement stmt;
		ResultSet rs;
		try {
			stmt = this.connect.createStatement();
			rs=stmt.executeQuery("select * from departement where id_universite="+id_universite);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	@Override
	public Departement find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
