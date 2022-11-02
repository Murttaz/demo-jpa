package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="régions")
public class Region {
	
	@Id
	private int id;
	
	@Column(name="nom",length=30,nullable=false,unique=true)
	private String nom;

	//constructeur
	public Region() {
		
	}
	
	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	

	
}
