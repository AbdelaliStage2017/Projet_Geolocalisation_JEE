package com.Beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Universite {
	private int id_Universite;
	private String Nom;
	private Date DateCreation;
	private String Description;
	private Set<Departement> listDepartements = new HashSet<Departement>();
	private Adresse adresse;

	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Date getDateCreation() {
		return DateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		DateCreation = dateCreation;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getId_Universite() {
		return id_Universite;
	}
	public Set<Departement> getListDepartements() {
		return listDepartements;
	}
	public void setListDepartements(Set<Departement> listDepartements) {
		this.listDepartements = listDepartements;
	}
	
	public void addDepartement(Departement Departement) {
		this.listDepartements.add(Departement);
	}
	
	public void removeDepartement(Departement Departement) {
		this.listDepartements.remove(Departement);
	}
	
}
