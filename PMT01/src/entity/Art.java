package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Art {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String name;
	private String beschreibung;
	
	public Art() {}
	
	public Art(String n, String b) {
		this.name = n;
		this.beschreibung = b;
	}
	
	//Setter- und Getter-Methoden

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	

	

}
