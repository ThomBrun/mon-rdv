package formation.model;

import java.util.ArrayList;
import java.util.List;

public class Motif {
	private Long id;
	private int version;
	private String nom;
	private int duree;
	private List<Rdv> Rdvs = new ArrayList<Rdv>();
	private Praticien praticien;
	private List<Lieu> lieux = new ArrayList<Lieu>();

	public Motif() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motif(String nom, int duree, List<Rdv> rdvs, Praticien praticien, List<Lieu> lieux) {
		super();
		this.nom = nom;
		this.duree = duree;
		Rdvs = rdvs;
		this.praticien = praticien;
		this.lieux = lieux;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public List<Rdv> getRdvs() {
		return Rdvs;
	}

	public void setRdvs(List<Rdv> rdvs) {
		Rdvs = rdvs;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public List<Lieu> getLieux() {
		return lieux;
	}

	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}

	@Override
	public String toString() {
		return "Motif [id=" + id + ", version=" + version + ", nom=" + nom + ", duree=" + duree + ", Rdvs=" + Rdvs
				+ ", praticien=" + praticien + ", lieux=" + lieux + ", getId()=" + getId() + ", getVersion()="
				+ getVersion() + ", getNom()=" + getNom() + ", getDuree()=" + getDuree() + ", getRdvs()=" + getRdvs()
				+ ", getPraticien()=" + getPraticien() + ", getLieux()=" + getLieux() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}