package village;

import java.util.Date;

public class Gaulois{
	
	private String nom;
	private EnumGenre genre;
	private Date date;
	private EnumStatut status;
	
	
	public Gaulois(String nom, Date dateDeNAissance, EnumGenre genre, EnumStatut  status ) {
		this.nom = nom;
		this.date = dateDeNAissance;
		this.genre = genre;
		this.status = status;
		
	}


	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", genre=" + genre + ", date=" + date + ", status=" + status + "]";
	}


	public String getNom() {
		return nom;
	}


	public EnumGenre getGenre() {
		return genre;
	}


	public Date getDate() {
		return date;
	}


	public EnumStatut getStatus() {
		return status;
	}

}
