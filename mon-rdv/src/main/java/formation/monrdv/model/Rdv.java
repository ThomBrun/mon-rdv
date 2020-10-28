package formation.monrdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Rdv {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	
	@JsonView(Views.ViewRdv.class)
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	@OneToMany(mappedBy = "rdv")
	@JsonView(Views.ViewRdv.class)
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	@ManyToOne
	@JoinColumn(name = "motif_id")
	@JsonView(Views.ViewRdv.class)
	private Motif motif;
	
	public Rdv() {
		super();
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}

	public Motif getMotif() {
		return motif;
	}

	public void setMotif(Motif motif) {
		this.motif = motif;
	}

	@Override
	public String toString() {
		return "Rdv [id=" + id + ", version=" + version + ", patient=" + patient + ", creneaux=" + creneaux + ", motif="
				+ motif + "]";
	}
}
