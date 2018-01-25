package com.Beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Departement {
	private int id_Departement;
	private String Nom;
	private String Specialisation;
	private Date DateCreation;
	private String Description;
	private Set<Laboratoire> listLaboratoires = new HashSet<Laboratoire>();
	private Adresse adresse;
	private int id_universite;

	public int getId_universite() {
		return id_universite;
	}
	public void setId_universite(int id_universite) {
		this.id_universite = id_universite;
	}
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
	public String getSpecialisation() {
		return Specialisation;
	}
	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
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
	public int getId_Departement() {
		return id_Departement;
	}
	public Set<Laboratoire> getListLaboratoires() {
		return listLaboratoires;
	}
	public void setListLaboratoires(Set<Laboratoire> listLaboratoires) {
		this.listLaboratoires = listLaboratoires;
	}
	
	public void addLaboratoire(Laboratoire Laboratoire) {
		this.listLaboratoires.add(Laboratoire);
	}
	
	public void removeLaboratoire(Laboratoire Laboratoire) {
		this.listLaboratoires.remove(Laboratoire);
	}
	
	
}
