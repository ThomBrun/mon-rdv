package formation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends Utilisateur{
	private Long id;
	private int version;
	private Date dtNaissance;
	private String nom;
	private String prenom;
	private String rue;
	private int numero;
	private int codePostal;
	private String ville;
	private List<Rdv> rdvs = new ArrayList<Rdv>();

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Date dtNaissance, String nom, String prenom, String rue, int numero, int codePostal, String ville, List<Rdv> rdvs) {
		super();
		this.dtNaissance = dtNaissance;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.numero = numero;
		this.codePostal = codePostal;
		this.ville = ville;
		this.rdvs = rdvs;
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

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
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

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Rdv> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", version=" + version + ", dtNaissance=" + dtNaissance + ", nom=" + nom
				+ ", prenom=" + prenom + ", rue=" + rue + ", numero=" + numero + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", rdvs=" + rdvs + "]";
	}

}
