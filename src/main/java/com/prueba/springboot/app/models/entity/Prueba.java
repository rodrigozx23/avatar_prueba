package com.prueba.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_prueba")
public class Prueba implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String gender;
	private String planet;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getHair_color() {
		return hair_color;
	}
	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlanet() {
		return planet;
	}
	public void setPlanet(String planet) {
		this.planet = planet;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
