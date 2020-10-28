package formation.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Praticien extends Utilisateur {
	private String nom;
	private String prenom;
	private int uniteHoraire;

	@ManyToMany
	@JoinTable(name="praticien_specialite", joinColumns = @JoinColumn(name= "praticien_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="specialite_id", referencedColumnName = "id"))
	private List<Specialite> specialites = new ArrayList<Specialite>();
	
	@OneToMany(mappedBy = "praticien")
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	@ManyToMany
	@JoinTable(name="praticien_lieu", joinColumns = @JoinColumn(name= "praticien_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="lieu_id", referencedColumnName = "id"))
	private List<Lieu> lieux = new ArrayList<Lieu>();
	
	@OneToMany(mappedBy = "praticien")
	private List<Motif> motifs = new ArrayList<Motif>();
	
	public Praticien() {
		super();
	}

	public Praticien(String nom, String prenom, int uniteHoraire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.uniteHoraire = uniteHoraire;
		
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
	
	public int getUniteHoraire() {
		return uniteHoraire;
	}
	
	public void setUniteHoraire(int uniteHoraire) {
		this.uniteHoraire = uniteHoraire;
	}
	
	public List<Specialite> getSpecialites() {
		return specialites;
	}
	
	public void setSpecialites(List<Specialite> specialites) {
		this.specialites = specialites;
	}
	
	public List<Creneau> getCreneaux() {
		return creneaux;
	}
	
	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}
	
	public List<Lieu> getLieux() {
		return lieux;
	}
	
	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}
	
	public List<Motif> getMotifs() {
		return motifs;
	}
	
	public void setMotifs(List<Motif> motifs) {
		this.motifs = motifs;
	}
	
	@Override
	public String toString() {
		return "Praticien [nom=" + nom + ", prenom=" + prenom
				+ ", uniteHoraire=" + uniteHoraire + ", specialites=" + specialites + ", creneaux=" + creneaux
				+ ", lieux=" + lieux + ", motifs=" + motifs + "]";
	}
}