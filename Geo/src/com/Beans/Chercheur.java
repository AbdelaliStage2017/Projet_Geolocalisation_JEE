package com.Beans;
import java.util.Date;

public class Chercheur {
	private int idChercheur;
	private String Nom;
	private String Prenom;
	private Date Date_naissance;
	private String Telephone;
	private String Email;
	private String password;
	private String type;
	private int IdLabo;
	
	public int getIdLabo() {
		return IdLabo;
	}
	public void setIdLabo(int idLabo) {
		IdLabo = idLabo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDate_naissance() {
		return Date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		Date_naissance = date_naissance;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public int getIdChercheur() {
		return idChercheur;
	}
	
	

}
