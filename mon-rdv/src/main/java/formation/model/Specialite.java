package formation.model;

import java.util.ArrayList;
import java.util.List;

public class Specialite {
	
	private Long id;
	private int version;
	
	private String nom;
	
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	
	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialite(Long id, int version, String nom, List<Praticien> praticiens) {
		super();
		this.id = id;
		this.version = version;
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
