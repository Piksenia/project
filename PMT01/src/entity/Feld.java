package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feld {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String feldID;
	private Art artID;
	
	public Feld() {}
	
	public Feld(String fid, Art aid) {
		this.feldID = fid;
		this.artID = aid;
	}
	
	//Setter- und Getter-Methoden

	public String getFeldID() {
		return feldID;
	}

	public void setFeldID(String feldID) {
		this.feldID = feldID;
	}

	public Art getArtID() {
		return artID;
	}

	public void setArtID(Art artID) {
		this.artID = artID;
	}
	
	

	

}
