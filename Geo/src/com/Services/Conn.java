package com.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Conn {
		
		
		public static final Connection getConn()  {
			try {
				
					Class.forName("com.mysql.jdbc.Driver");
				
				return  DriverManager.getConnection("jdbc:mysql://localhost:3306/geolocalisation","root","");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
}