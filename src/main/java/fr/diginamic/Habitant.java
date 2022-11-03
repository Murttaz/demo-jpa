package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habitant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Id")
	private int id;
	
	@Column(name="nom",length=30)
	private String nom;
	
	@Column(name="prenom", length=30)
	private String prenom;

	public Habitant() {
		super();
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
