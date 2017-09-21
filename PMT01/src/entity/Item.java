package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String itemID;
	private String beschreibung;
	
	public Item() {}
	
	public Item(String iid, String b) {
		this.itemID = iid;
		this.beschreibung = b;
	}
	
	//Setter- und Getter-Methoden

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	

	
	

}
