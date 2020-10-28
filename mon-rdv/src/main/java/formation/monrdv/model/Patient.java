package formation.monrdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Patient extends Utilisateur {
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@JsonView(Views.ViewCommon.class)
	private String prenom;
	@JsonView(Views.ViewCommon.class)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dtNaissance;
	@JsonView(Views.ViewCommon.class)
	private int numero;
	@JsonView(Views.ViewCommon.class)
	private String rue;
	@JsonView(Views.ViewCommon.class)
	private int codePostal;
	@JsonView(Views.ViewCommon.class)
	private String ville;
	
	@JsonView(Views.ViewPatient.class)
	@OneToMany(mappedBy = "patient")
	private List<Rdv> rdvs = new ArrayList<Rdv>();

	public Patient() {
		super();
	}
	
	public Patient(String nom, String prenom, Date dtNaissance, int numero, String rue,
			int codePostal, String ville) {
		super();
		this.dtNaissance = dtNaissance;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.numero = numero;
		this.codePostal = codePostal;
		this.ville = ville;
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
		return "Patient [dtNaissance=" + dtNaissance + ", nom=" + nom
				+ ", prenom=" + prenom + ", rue=" + rue + ", numero=" + numero + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", rdvs=" + rdvs + "]";
	}
}