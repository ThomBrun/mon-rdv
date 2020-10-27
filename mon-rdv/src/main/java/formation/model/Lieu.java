package formation.model;

import java.util.ArrayList;
import java.util.List;

public class Lieu {
	private Long id;
	private int version;
	private String nom;
	private String rue;
	private String ville;
	private int codePostal;
	private int numero;
	
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	private List<Motif> motifs = new ArrayList<Motif>();
	
	public Lieu() {
		super();
	}

	public Lieu(String nom, String rue, String ville, int codePostal, int numero, List<Creneau> creneaux,
			List<Praticien> praticiens, List<Motif> motifs) {
		super();
		this.nom = nom;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.numero = numero;
		this.creneaux = creneaux;
		this.praticiens = praticiens;
		this.motifs = motifs;
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

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}

	public List<Praticien> getPraticiens() {
		return praticiens;
	}

	public void setPraticiens(List<Praticien> praticiens) {
		this.praticiens = praticiens;
	}

	public List<Motif> getMotifs() {
		return motifs;
	}

	public void setMotifs(List<Motif> motifs) {
		this.motifs = motifs;
	}

	@Override
	public String toString() {
		return "Lieu [id=" + id + ", version=" + version + ", nom=" + nom + ", rue=" + rue + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", numero=" + numero + ", creneaux=" + creneaux + ", praticiens="
				+ praticiens + ", motifs=" + motifs + "]";
	}
}