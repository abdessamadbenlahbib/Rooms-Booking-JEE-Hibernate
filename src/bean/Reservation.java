package bean;

import java.sql.Date;


public class Reservation {
	
	private Integer idReservation;
	private String user;
	private String numroom;
	private String fullname;
	private String phone;
	private String street;
	private String city;
	private String country;
	private String nationality;
	private Date reservationdate;
	private java.util.Date reservationstart;
	private Date reservationend;
	private int reservationperiod;
	private int prix;
	private int numberperson;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(String user, String numroom, String fullname, String phone, String street, String city,
			String country, String nationality, Date reservationdate, java.util.Date reservationstart,
			Date reservationend, int reservationperiod, int prix, int numberperson) {
		super();
		this.user = user;
		this.numroom = numroom;
		this.fullname = fullname;
		this.phone = phone;
		this.street = street;
		this.city = city;
		this.country = country;
		this.nationality = nationality;
		this.reservationdate = reservationdate;
		this.reservationstart = reservationstart;
		this.reservationend = reservationend;
		this.reservationperiod = reservationperiod;
		this.prix = prix;
		this.numberperson = numberperson;
	}

	public Integer getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getNumroom() {
		return numroom;
	}

	public void setNumroom(String numroom) {
		this.numroom = numroom;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getReservationdate() {
		return reservationdate;
	}

	public void setReservationdate(Date reservationdate) {
		this.reservationdate = reservationdate;
	}

	public java.util.Date getReservationstart() {
		return reservationstart;
	}

	public void setReservationstart(java.util.Date reservationstart) {
		this.reservationstart = reservationstart;
	}

	public Date getReservationend() {
		return reservationend;
	}

	public void setReservationend(Date reservationend) {
		this.reservationend = reservationend;
	}

	public int getReservationperiod() {
		return reservationperiod;
	}

	public void setReservationperiod(int reservationperiod) {
		this.reservationperiod = reservationperiod;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getNumberperson() {
		return numberperson;
	}

	public void setNumberperson(int numberperson) {
		this.numberperson = numberperson;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", user=" + user + ", numroom=" + numroom + ", fullname="
				+ fullname + ", phone=" + phone + ", street=" + street + ", city=" + city + ", country=" + country
				+ ", nationality=" + nationality + ", reservationdate=" + reservationdate + ", reservationstart="
				+ reservationstart + ", reservationend=" + reservationend + ", reservationperiod=" + reservationperiod
				+ ", prix=" + prix + ", numberperson=" + numberperson + "]";
	}

	

}
