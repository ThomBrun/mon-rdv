package formation.model;

public class Administrateur extends Utilisateur{
	private Long id;
	private int version;

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Administrateur [id=" + id + ", version=" + version + "]";
	}

}