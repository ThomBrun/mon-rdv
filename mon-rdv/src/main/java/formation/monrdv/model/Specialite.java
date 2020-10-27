package formation.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
public class Specialite {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	
	@Transient
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	
	public Specialite() {
		super();
	}

	public Specialite(String nom, List<Praticien> praticiens) {
		super();
		this.nom = nom;
		this.praticiens = praticiens;
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

	public List<Praticien> getPraticiens() {
		return praticiens;
	}

	public void setPraticiens(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}

	@Override
	public String toString() {
		return "Specialite [id=" + id + ", version=" + version + ", nom=" + nom + ", praticiens=" + praticiens + "]";
	}
}
