package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ereignis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String ereignisID;
	private String beschreibung;
	
	public Ereignis() {}
	
	public Ereignis(String eid, String b) {
		this.ereignisID = eid;
		this.beschreibung = b;
	}
	
	//Setter- und Getter-Methoden

	public String getEreignisID() {
		return ereignisID;
	}

	public void setEreignisID(String ereignisID) {
		this.ereignisID = ereignisID;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	
	

}
