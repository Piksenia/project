package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemonart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pokemonartID;
	private String beschreibung;
	private int[] fangrate;
	
	public Pokemonart() {}
	
	public Pokemonart(String id, String b, int[] f) {
		this.pokemonartID = id;
		this.beschreibung = b;
		this.fangrate = f;
	}
	
	//Setter- und Getter-Methoden 

	public String getPokemonartID() {
		return pokemonartID;
	}

	public void setPokemonartID(String pokemonartID) {
		this.pokemonartID = pokemonartID;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public int[] getFangrate() {
		return fangrate;
	}

	public void setFangrate(int[] fangrate) {
		this.fangrate = fangrate;
	}
	
	
	

}
