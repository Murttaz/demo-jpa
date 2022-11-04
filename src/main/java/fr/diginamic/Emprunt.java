package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="emprunt")
public class Emprunt {

	
	@Id
	private int id;
	
	@Column (name="DATE_DEBUT")
	@Temporal(TemporalType.DATE)
	private Date dateDeb;
	
	@Column (name="DATE_FIN", nullable=true)
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column (name="DELAI")
	private int delai;

	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	public Emprunt() {
		super();
	}

	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDeb=" + dateDeb + ", dateFin=" + dateFin + ", delai=" + delai + ", client="
				+ client + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}
	
}
