package bean;

public class Chambre {
	
	private Integer idChambre;
	private String numRoom;
	private String photo;
	private int numEtage;
	private int nbrPers;
	private int prix;
	private String desc;
	
	
	public Chambre() {
		// TODO Auto-generated constructor stub
	}


	public Chambre(String numRoom, String photo, int numEtage, int nbrPers, int prix, String desc) {
		super();
		this.numRoom = numRoom;
		this.photo = photo;
		this.numEtage = numEtage;
		this.nbrPers = nbrPers;
		this.prix = prix;
		this.desc = desc;
	}


	public Integer getIdChambre() {
		return idChambre;
	}


	public void setIdChambre(Integer idChambre) {
		this.idChambre = idChambre;
	}


	public String getNumRoom() {
		return numRoom;
	}


	public void setNumRoom(String numRoom) {
		this.numRoom = numRoom;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public int getNumEtage() {
		return numEtage;
	}


	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}


	public int getNbrPers() {
		return nbrPers;
	}


	public void setNbrPers(int nbrPers) {
		this.nbrPers = nbrPers;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	@Override
	public String toString() {
		return "Chambre [idChambre=" + idChambre + ", numRoom=" + numRoom + ", photo=" + photo + ", numEtage="
				+ numEtage + ", nbrPers=" + nbrPers + ", prix=" + prix + ", desc=" + desc + "]";
	}

	
	

	

}
