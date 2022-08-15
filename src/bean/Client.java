package bean;

public class Client {
	
	private Integer idClient;
	private String user;
	private String password;
	private String nom;
	private String prenom;
	private int age;
	private String tel;
	private String adresse;
	private String nationalite;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String user, String password, String nom, String prenom, int age, String tel, String adresse,
			String nationalite) {
		super();
		this.user = user;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.tel = tel;
		this.adresse = adresse;
		this.nationalite = nationalite;
	}

	
	
	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	@Override
	public String toString() {
		return "Client [user=" + user + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", age="
				+ age + ", tel=" + tel + ", adresse=" + adresse + ", nationalite=" + nationalite + "]";
	}
	
	


}
