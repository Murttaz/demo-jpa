package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class Adresse {

	
// pour un embeddable, pas d'ID car Adresse n'a pas sa propre table
	
	@Column
	private String LibelleVoie;
	
	@Column 
	private int CodePostal;
	
	@Column
	private String ville;

	public Adresse() {
		super();
	}

	public String getLibelleVoie() {
		return LibelleVoie;
	}

	public void setLibelleVoie(String libelleVoie) {
		LibelleVoie = libelleVoie;
	}

	public int getCodePostal() {
		return CodePostal;
	}

	public void setCodePostal(int codePostal) {
		CodePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
}
