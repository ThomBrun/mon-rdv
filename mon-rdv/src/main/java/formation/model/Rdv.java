package formation.model;

public class Rdv {
	
	private Long id;
	private int version;
	
	private Patient patient = new Patient();
	
	private Motif motif = new Motif();

	
	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rdv(Long id, int version, Patient patient, Motif motif) {
		super();
		this.id = id;
		this.version = version;
		this.patient = patient;
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


	public Motif getMotif() {
		return motif;
	}


	public void setMotif(Motif motif) {
		this.motif = motif;
	}


	@Override
	public String toString() {
		return "Rdv [id=" + id + ", version=" + version + ", patient=" + patient + ", motif=" + motif + "]";
	}
	

}
