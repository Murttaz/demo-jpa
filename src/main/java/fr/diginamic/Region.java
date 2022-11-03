package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
	
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom",length=30,nullable=false,unique=true)
	private String nom;
	
	@OneToMany(mappedBy ="region")
	private List<Ville> villes=new ArrayList<Ville>();
	

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
	public List<Ville> getVilles() {
		return villes;
	}
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
	

	
}
