package formation.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Lieu {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@JsonView(Views.ViewCommon.class)
	private String rue;
	@JsonView(Views.ViewCommon.class)
	private String ville;
	@JsonView(Views.ViewCommon.class)
	private int codePostal;
	@JsonView(Views.ViewCommon.class)
	private int numero;
	
	@OneToMany(mappedBy = "lieu")
	@JsonView(Views.ViewLieu.class)
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	@ManyToMany(mappedBy = "lieux")
	@JsonView(Views.ViewLieu.class)
	private List<Praticien> praticiens = new ArrayList<Praticien>();
	
	@ManyToMany(mappedBy = "lieux")
	@JsonView(Views.ViewLieu.class)
	private List<Motif> motifs = new ArrayList<Motif>();
	
	public Lieu() {
		super();
	}

	public Lieu(String nom, String rue, String ville, int codePostal, int numero) {
		super();
		this.nom = nom;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.numero = numero;
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