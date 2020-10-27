package formation.model;

import java.util.ArrayList;
import java.util.List;

public class Rdv {
	private Long id;
	private int version;
	
	private Patient patient;
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	private Motif motif;
	
	public Rdv() {
		super();
	}

	public Rdv(Patient patient, List<Creneau> creneaux, Motif motif) {
		super();
		this.patient = patient;
		this.creneaux = creneaux;
		this.motif = motif;
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
