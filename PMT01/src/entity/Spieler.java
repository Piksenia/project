package entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import map.Vertex;


@Entity
public class Spieler {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String spielerID;
	private  String farbe;
	private Vertex vertexID;
	private ArrayList<Item> itemliste;
	private ArrayList<Pokemon> pokemonliste;
	
	public Spieler() {}
	
	public Spieler(String sid, String f,  Vertex v, ArrayList<Item> il, ArrayList<Pokemon> pl) {
		this.spielerID = sid;
		this.farbe = f;
		this.vertexID = v;
		this.itemliste = il;
		this.pokemonliste = pl;
	}
	
	//Getter- und Setter-Methode


	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public String getSpielerID() {
		return spielerID;
	}

	public void setSpielerID(String spielerID) {
		this.spielerID = spielerID;
	}

	public Vertex getVertexID() {
		return vertexID;
	}

	public void setVertexID(Vertex vertexID) {
		this.vertexID = vertexID;
	}

	public ArrayList<Item> getItemliste() {
		return itemliste;
	}

	public void setItemliste(ArrayList<Item> itemliste) {
		this.itemliste = itemliste;
	}

	public ArrayList<Pokemon> getPokemonliste() {
		return pokemonliste;
	}

	public void setPokemonliste(ArrayList<Pokemon> pokemonliste) {
		this.pokemonliste = pokemonliste;
	}
	
	
	
	
	
	
	

}
