package formation.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

//@Entity
public class Praticien extends Utilisateur {
	private String nom;
	private String prenom;
	private int uniteHoraire;

	private List<Specialite> specialites = new ArrayList<Specialite>();
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	private List<Lieu> lieux = new ArrayList<Lieu>();
	private List<Motif> motifs = new ArrayList<Motif>();
	
	public Praticien() {
		super();
	}

	public Praticien(String nom, String prenom, int uniteHoraire, List<Specialite> specialites, List<Creneau> creneaux,
			List<Lieu> lieux, List<Motif> motifs) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.uniteHoraire = uniteHoraire;
		this.specialites = specialites;
		this.creneaux = creneaux;
		this.lieux = lieux;
		this.motifs = motifs;
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