package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="livre")
public class Livre {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="TITRE", length=50)
	private String titre;
	
	@Column (name="AUTEUR", length=30)
	private String auteur;
	
	@ManyToMany
	@JoinTable(name="COMPO",
	joinColumns = @JoinColumn(name="ID_LIV",referencedColumnName="ID"),
	inverseJoinColumns = @JoinColumn(name="ID_EMP",referencedColumnName="ID"))
	private List<Emprunt> emprunts1=new ArrayList<Emprunt>();

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public List<Emprunt> getEmprunts1() {
		return emprunts1;
	}

	public void setEmprunts1(List<Emprunt> emprunts1) {
		this.emprunts1 = emprunts1;
	}

	public Livre() {
		super();
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}



}
