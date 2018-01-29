package com.Beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class These {

	private int id_These;
	private String Titre;
	private Date DateCreation;
	private String Description;
	private ArrayList<Integer> Theme = new	ArrayList<Integer>();
	private Set<Adresse> LieuDeRecherche = new HashSet<Adresse>();
	
	
	public int getId_These() {
		return id_These;
	}
	
	public String getTitre() {
		return Titre;
	}
	
	public Date getDateCreation() {
		return DateCreation;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public ArrayList<Integer> getTheme() {
		return Theme;
	}
	
	public Set<Adresse> getLieuDeRecherche() {
		return LieuDeRecherche;
	}
	
	public void setId_These(int id) {
		id_These = id;
	}
	
	public void setTitre(String titre) {
		Titre = titre;
	}
	
	public void setDateCreation(Date date) {
		DateCreation = date;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public void setTheme(ArrayList<Integer>	theme) {
		Theme = theme;
	}
	
	public void setLieuDeRecherche(Set<Adresse> lieu) {
		LieuDeRecherche = lieu;
	}
	
	public void addLieuDeRecherche	(Adresse lieu) {
		this.LieuDeRecherche.add(lieu);
	}
	
	public void removeLieuDeRecherche(Adresse lieu) {
		this.LieuDeRecherche.remove(lieu);
	}
	

	public void addTheme	(int theme) {
		this.Theme.add(theme);
	}
	
	public void removeTheme	(int theme) {
		this.Theme.remove(theme);
	}
	
}
