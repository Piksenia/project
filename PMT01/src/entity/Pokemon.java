package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String pokemonID;
	private int angriffspunkte;
	private int kraftpunkte;
	private boolean starter;
	private boolean besiegt;
	private Pokemon vorEvolution;
	private Pokemon nachEvolution;
	private Feld fid;
	private Pokemonart artID;
	
	public Pokemon() {}
	
	public Pokemon(String pid, int ap, int kp, boolean s, boolean b, Pokemon ve, Pokemon ne, Feld f, Pokemonart a) {
		this.pokemonID = pid;
		this.angriffspunkte = ap;
		this.kraftpunkte = kp;
		this.starter = s;
		this.besiegt = b;
		this.vorEvolution = ve;
		this.nachEvolution = ne;
		this.fid = f;
		this.artID = a;
	}

	public String getPokemonID() {
		return pokemonID;
	}

	public void setPokemonID(String pokemonID) {
		this.pokemonID = pokemonID;
	}

	public int getAngriffspunkte() {
		return angriffspunkte;
	}

	public void setAngriffspunkte(int angriffspunkte) {
		this.angriffspunkte = angriffspunkte;
	}

	public int getKraftpunkte() {
		return kraftpunkte;
	}

	public void setKraftpunkte(int kraftpunkte) {
		this.kraftpunkte = kraftpunkte;
	}

	public boolean isStarter() {
		return starter;
	}

	public void setStarter(boolean starter) {
		this.starter = starter;
	}

	public boolean isBesiegt() {
		return besiegt;
	}

	public void setBesiegt(boolean besiegt) {
		this.besiegt = besiegt;
	}

	public Pokemon getVorEvolution() {
		return vorEvolution;
	}

	public void setVorEvolution(Pokemon vorEvolution) {
		this.vorEvolution = vorEvolution;
	}

	public Pokemon getNachEvolution() {
		return nachEvolution;
	}

	public void setNachEvolution(Pokemon nachEvolution) {
		this.nachEvolution = nachEvolution;
	}

	public Feld getFid() {
		return fid;
	}

	public void setFid(Feld fid) {
		this.fid = fid;
	}

	public Pokemonart getArtID() {
		return artID;
	}

	public void setArtID(Pokemonart artID) {
		this.artID = artID;
	}
	
	
	
	

}
