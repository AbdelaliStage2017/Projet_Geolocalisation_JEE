package com.Beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Laboratoire {
	
	private int id_labo;
	private String Nom;
	private String Domaine;
	private Date DateCreation;
	private String Description;
	private Set<Chercheur> listChercheurs = new HashSet<Chercheur>();
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
	public String getDomaine() {
		return Domaine;
	}
	public void setDomaine(String domaine) {
		Domaine = domaine;
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
	public int getId_labo() {
		return id_labo;
	}
	public Set<Chercheur> getListChercheurs() {
		return listChercheurs;
	}
	public void setListChercheurs(Set<Chercheur> listChercheurs) {
		this.listChercheurs = listChercheurs;
	}
	
	public void addChercheur(Chercheur chercheur) {
		this.listChercheurs.add(chercheur);
	}
	
	public void removeChercheur(Chercheur chercheur) {
		this.listChercheurs.remove(chercheur);
	}
	

}
