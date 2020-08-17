package Models;

public class Personne {

	private int id ;
	private String nom ;
	private String login ; 
	private String prenom ; 
	private String adresse ;
	private String password ;
	
	public Personne () {
		super();
	
	}

	public int getId() {
		return id;
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Personne(int id,String login ,String nom, String prenom, String adresse, String password) {
		this.id = id;
		this.login=login;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.password = password;
	}
	public Personne(String login ,String nom, String prenom, String adresse, String password) {
		this.login=login;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.password = password;
	}
	public Personne(Personne p) {
		this.id = p.id;
		this.login=p.login;
		this.nom = p.nom;
		this.prenom =p.prenom;
		this.adresse = p.adresse;
		this.password = p.password;
	}


	@Override
	public String toString() {
		return "Personne [id=" + id + ",login=" +login+ ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", password="
				+ password + "]";
	}
	
	
}
