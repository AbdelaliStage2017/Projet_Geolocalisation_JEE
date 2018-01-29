package com.Beans;

import java.util.Date;

public class Contribution {
	
	private int id_Contribution;
	private int id_Chercheur;
	private int id_These;
	private Date DateCreation;
	private String Description;

	public int getId_Contribution() {
		return id_Contribution;
	}
	
	public int getId_Chercheur() {
		return id_Chercheur;
	}
	
	public int getId_These() {
		return id_These;
	}
	
	public Date getDateCreation() {
		return DateCreation;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setId_Contribution(int id) {
		id_Contribution = id;
	}
	
	public void setId_Chercheur(int id) {
		id_Chercheur = id;
	}
	
	public void setId_These(int id) {
		id_These = id;
	}
	
	public void setDateCreation(Date date) {
		DateCreation = date;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	
}
