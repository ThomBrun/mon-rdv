package formation.monrdv.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Creneau {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="rdv_id")
	private Rdv rdv;
	@ManyToOne
	@JoinColumn(name="praticien_id")
	private Praticien praticien;
	@ManyToOne
	@JoinColumn(name="lieu_id")
	private Lieu lieu;
	
	public Creneau() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Creneau(Date date, Rdv rdv, Praticien praticien, Lieu lieu) {
		super();
		this.date = date;
		this.rdv = rdv;
		this.praticien = praticien;
		this.lieu = lieu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Rdv getRdv() {
		return rdv;
	}

	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "Creneau [id=" + id + ", version=" + version + ", date=" + date + ", rdv=" + rdv + ", praticien="
				+ praticien + ", lieu=" + lieu + "]";
	}

	
}
