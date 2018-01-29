package com.Beans;

import java.util.ArrayList;



public class Theme {
	

	private int id_Theme;
	private String Nom;
	private String Description;
	private ArrayList<Integer> These = new	ArrayList<Integer>();
	
	public int getId_Theme() {
		return id_Theme;
	}
	
	public String getNom() {
		return Nom;
	}
	
	
	public String getDescription() {
		return Description;
	}
	
	public ArrayList<Integer> getThese() {
		return These;
	}
	
	public void setId_Theme(int id) {
		id_Theme = id;
	}
	
	public void setNom(String nom) {
		Nom =	nom;
	}
	
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public void setThese(ArrayList<Integer>	these) {
		These = these;
	}
	
	public void addThese	(int these) {
		this.These.add(these);
	}
	
	public void removeThese	(int these) {
		this.These.remove(these);
	}

}
