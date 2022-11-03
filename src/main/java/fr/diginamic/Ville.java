package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idv;

	@Column(name = "nom", length = 30, nullable = false, unique = true)
	private String nom;

	@Column(name = "Code_Postal", length = 5, nullable = false)
	private int CP;

	@Column(name = "DateDernierRecensement", length = 30, nullable = false, unique = true)
	@Temporal(TemporalType.DATE)
	private Date dater;

	@Column(name = "Categorie", length = 15, nullable = false)
	@Enumerated(EnumType.STRING)
	private Categorie cat;

	@ManyToOne
	@JoinColumn(name= "ID_REGION")
	private Region region;

	public Ville() {
		super();
	}

	@ManyToMany
	@JoinTable(name = "Lien_VILLE_HABITANT", joinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "IDV"), inverseJoinColumns = @JoinColumn(name = "ID_HAB", referencedColumnName = "ID"))
	List<Habitant> habs = new ArrayList<Habitant>();

	public List<Habitant> getHabs() {
		return habs;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public void setHabs(List<Habitant> habs) {
		this.habs = habs;
	}

	@Override
	public String toString() {
		return "Ville [idv=" + idv + ", nom=" + nom + ", CP=" + CP + ", dater=" + dater + ", cat=" + cat + "]";
	}

	public int getIdv() {
		return idv;
	}

	public void setIdv(int idv) {
		this.idv = idv;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public Date getDater() {
		return dater;
	}

	public void setDater(Date dater) {
		this.dater = dater;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}

}
