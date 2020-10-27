package formation.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Motif {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	private int duree;
	
	@OneToMany(mappedBy = "motif")
	private List<Rdv>Rdvs = new ArrayList<Rdv>();
	@ManyToOne
	@JoinColumn(name="praticien_id")
	private Praticien praticien;
	@ManyToMany
	@JoinTable(name="motif_lieu", joinColumns = @JoinColumn(name= "motif_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="lieu_id", referencedColumnName = "id"))
	private List<Lieu>lieux = new ArrayList<Lieu>();
	
	public Motif() {
		super();
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