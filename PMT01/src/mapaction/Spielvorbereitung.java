package mapaction;

import java.util.ArrayList;

import entity.Item;
import entity.Pokemon;
import entity.Spieler;
import images.DrawSpieler;
import map.AufbauMap;

public class Spielvorbereitung {
	
	public static ArrayList<Spieler> beginn(String farbe1, String pokemonID1, String farbe2, String pokemonID2) {

		ArrayList<Item> itemp1 = new ArrayList<Item>();
		ArrayList<Pokemon> pokemonp1 = new ArrayList<Pokemon>();
		ArrayList<Item> itemp2 = new ArrayList<Item>();
		ArrayList<Pokemon> pokemonp2 = new ArrayList<Pokemon>();
		Spieler p1 = new Spieler("001", farbe1, AufbauMap.ALL[0], itemp1,pokemonp1);
		Spieler p2 = new Spieler("002", farbe2, AufbauMap.ALL[0], itemp2,pokemonp2);
		//Pokemon mit ID suchen und in ein Pokemon Objekt speichert und in die Add Methode hinzufügen.
		//p1.getPokemonliste().add();
		//p2.getPokemonliste().add();	
		 ArrayList<Spieler>spielerliste = new  ArrayList<Spieler>();
		 spielerliste.add(p1);
		 spielerliste.add(p2);
		 DrawSpieler.player1X = AufbauMap.ALL[0].xko;
		 DrawSpieler.player1Y = AufbauMap.ALL[0].yko;
		 DrawSpieler.player2X = AufbauMap.ALL[0].xko;
		 DrawSpieler.player2Y = AufbauMap.ALL[0].yko;
		 
		return spielerliste;
	}

}
