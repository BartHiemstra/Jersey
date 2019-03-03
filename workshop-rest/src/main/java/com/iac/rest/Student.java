package com.iac.rest;

public class Student {
	private int 	id;
	private String 	voornaam;
	private String 	achternaam;
	private int 	leeftijd;
	private String 	opleiding;
	
	public Student(int id, String voornaam, String achternaam, int leeftijd, String opleiding) {
		this.id = id;
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.leeftijd = leeftijd;
		this.opleiding = opleiding;
	}
	
	public int getId() {
		return id;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

	public String getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}
}