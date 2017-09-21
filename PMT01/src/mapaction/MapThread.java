package mapaction;



import java.util.ArrayList;

import javax.swing.JOptionPane;

import entity.Spieler;

public class MapThread extends Thread{
	public Object lock;
	 ArrayList<Spieler> spieler = Spielvorbereitung.beginn("Red", "Glumanda", "Blue", "Schiggy");
	boolean spielfluss = true;
	int zaehler = 0;
	
	@Override
	public void run() {
		while(spielfluss) {
			++zaehler;
			System.out.println("Runde "+zaehler+ ": ////////////");
			SpielAktiv.zug(spieler.get(0));
			SpielAktiv.zug(spieler.get(1));
			System.out.println();
			Object[] options = {"Nächste Runde", "Beenden"};
			int selected = JOptionPane.showOptionDialog(null, "Möchten Sie das Spiel beenden? ","Quit Game",JOptionPane.DEFAULT_OPTION, 
	                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if (selected == 0) {
				continue;
			}
			else if(selected == 1) {
				spielfluss = false;
			}
		}
		
	}
}

	/*
	public void run() {
		
		ArrayList<Spieler> spieler = Spielvorbereitung.beginn("Red", "Glumanda", "Blue", "Schiggy");
		boolean spielfluss = true;
		int zaehler = 0;
		while(spielfluss) {
			++zaehler;
			System.out.println("Runde "+zaehler+ ": ////////////");
			SpielAktiv.zug(spieler.get(0));
			SpielAktiv.zug(spieler.get(1));
			System.out.println();
			Object[] options = {"Nächste Runde", "Beenden"};
			int selected = JOptionPane.showOptionDialog(null, "Möchten Sie das Spiel beenden? ","Quit Game",JOptionPane.DEFAULT_OPTION, 
	                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if (selected == 0) {
				continue;
			}
			else if(selected == 1) {
				spielfluss = false;
			}
		}
		System.out.println("SPIEL ENDE");
	}*/
	
	





