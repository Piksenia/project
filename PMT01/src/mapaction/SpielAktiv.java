package mapaction;

import javax.swing.JOptionPane;

import entity.Spieler;
import images.DrawSpieler;
import map.AufbauMap;
import map.Vertex;

public class SpielAktiv {
	
	public static void zug(Spieler p) {
		System.out.println("Zug von Spieler " + p.getFarbe());
		System.out.println("Vor dem Wurf: Der Spieler befindet sich auf dem Feld "+ p.getVertexID().name);
		//custom title, warning icon
				JOptionPane.showMessageDialog(null,
				    "Bist du bereit "+ p.getFarbe() + "? Du befindest dich gerade auf dem Feld " +p.getVertexID().name ,
				    "Inane warning",
				    JOptionPane.WARNING_MESSAGE);
		int a = wuerfeln();
		System.out.println("Der Spieler würfelte die Zahl " + a);
		Vertex x = gehen(p.getVertexID(), a,p);
		p.setVertexID(x);
		if(p.getFarbe().equals("Red")) {
			DrawSpieler.player1X = x.xko;
			DrawSpieler.player1Y = x.yko;
			
		}
		else if(p.getFarbe().equals("Blue")) {
			DrawSpieler.player2X = x.xko;
			DrawSpieler.player2Y = x.yko;
		}
		System.out.println("Nach dem Wurf: Der Spieler befindet sich auf dem Feld "+ p.getVertexID().name);	
	}
	
	public static int wuerfeln() {
		int zahl = 0;
		zahl = (int)((Math.random()) * 6 + 1);
		JOptionPane.showMessageDialog(null,
			    "Du hast die Zahl: " +zahl+ " gewürfelt!" ,
			    "Inane warning",
			    JOptionPane.WARNING_MESSAGE);
		return zahl;
	}
	
	public static int schrittfelderpruefung(Vertex start){
		boolean stop = true;
		int a = 0;
		while(stop) {
			Vertex p = AufbauMap.ALL[a];
			
			if(start.equals(p))
			{
				
				stop = false;
				break;
			}
			++a;	
		}
		return a;
	}
	
		
	
	
	public static Vertex gehen(Vertex start, int zahl, Spieler sp) {
		Vertex x = null;
		Vertex vorherig = null;
		int hochzaehlen = 1;
		int i = 0;
		int a = schrittfelderpruefung(start);
		//Prüfung, ob die vergangenen Felder kleiner sind als die gewürfelte Zahl
		if(zahl > a) {
		i = zahl + a;
		x = AufbauMap.ALL[i];
		}
		else if(a == 57){
		
			while(zahl > 0) {
				vorherig = AufbauMap.ALL[i];
				i = a - hochzaehlen;
				x = AufbauMap.ALL[i];
				--zahl;
				x = pruefAbzweigung(x, vorherig);
				a = schrittfelderpruefung(x);
				}
		}
		else {
			// Bestägungsdialog; 
			Object[] options = {"Voran", "Zurück"};
			int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung für Spieler: "+ sp.getFarbe(),JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			if (selected == 0) {
				while(zahl > 0) {
				vorherig = AufbauMap.ALL[a];
				i = hochzaehlen + a;
				x = AufbauMap.ALL[i];
				--zahl;
				x = pruefAbzweigung(x, vorherig);
				a = schrittfelderpruefung(x);
				}
				
			} else if (selected == 1) {
				while(zahl > 0) {
				vorherig = AufbauMap.ALL[i];
				i = a - hochzaehlen;
				x = AufbauMap.ALL[i];
				--zahl;
				x = pruefAbzweigung(x, vorherig);
				a = schrittfelderpruefung(x);
				}
				x = AufbauMap.ALL[i];
			} 
		}	
		
		return x;
	}
	
	
	public static Vertex pruefAbzweigung(Vertex x, Vertex vor) {
		int vorher = 0;
		int aktuell = 0;
		Vertex neu = x;
		vorher = schrittfelderpruefung(vor);
		aktuell = schrittfelderpruefung(x);
		//System.out.println("Ich war vorher auf dem Feld "+ vorher);
		switch(aktuell) {
		//Abzweigung Azuria City
			case 24:
				//Ich komme aus Lavandia
				if(vorher == 28) {
					Object[] options = {"Marmoria", "Saffronia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s27
						neu = AufbauMap.ALL[22];
					}
					else if (selected == 1) {
						//s25
						neu = AufbauMap.ALL[24];
					}
				}
				//Ich komme aus Marmoria
				if(vorher == 23) {
					Object[] options = {"Lavandia", "Saffronia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s28
						neu = AufbauMap.ALL[27];
					}
					else if (selected == 1) {
						//s25
						neu = AufbauMap.ALL[24];
					}
				}
				//Ich komme aus Saffronia
				if(vorher == 25) {
					Object[] options = {"Marmoria", "Lavandia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s27
						neu = AufbauMap.ALL[22];
					}
					else if (selected == 1) {
						//s28
						neu = AufbauMap.ALL[27];
					}
				}	
			break;
			
			//Abzweigung Saffronia City
			case 27:
				//Ich komme aus Azuria
				if(vorher == 26) {
					Object[] options = {"Prismania", "Orania", "Lavandia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s42
						neu = AufbauMap.ALL[41];
					}
					else if (selected == 1) {
						//s39
						neu = AufbauMap.ALL[38];
					}
					else if (selected == 2) {
						//s36
						neu = AufbauMap.ALL[35];
					}
				}
				//Ich komme aus Prismania
				if(vorher == 42) {
					Object[] options = {"Azuria", "Orania", "Lavandia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s26
						neu = AufbauMap.ALL[25];
					}
					else if (selected == 1) {
						//s39
						neu = AufbauMap.ALL[38];
					}
					else if (selected == 2) {
						//s36
						neu = AufbauMap.ALL[35];
					}
				}
				//Ich komme aus Orania
				if(vorher == 39) {
					Object[] options = {"Prismania", "Azuria", "Lavandia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s42
						neu = AufbauMap.ALL[41];
					}
					else if (selected == 1) {
						//s26
						neu = AufbauMap.ALL[25];
					}
					else if (selected == 2) {
						//s36
						neu = AufbauMap.ALL[35];
					}
				}
				//Ich komme aus Lavandia
				if(vorher == 36) {
					Object[] options = {"Prismania", "Azuria", "Orania"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s42
						neu = AufbauMap.ALL[41];
					}
					else if (selected == 1) {
						//s26
						neu = AufbauMap.ALL[25];
					}
					else if (selected == 2) {
						//s39
						neu = AufbauMap.ALL[38];
					}
				}
				
			break;
			
			//Abzweigung Lavandia
			case 35:
				//Ich komme aus Azuria
				if(vorher == 34) {
					Object[] options = {"Saffronia", "zum Fangfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s38
						neu = AufbauMap.ALL[37];
					}
					else if (selected == 1) {
						//s68
						neu = AufbauMap.ALL[66];
					}
				}
				//Ich komme aus Saffronia
				if(vorher == 38) {
					Object[] options = {"Azuria", "zum Fangfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s34
						neu = AufbauMap.ALL[33];
					}
					else if (selected == 1) {
						//s68
						neu = AufbauMap.ALL[66];
					}
				}
				//Ich komme aus Fangfeld
				if(vorher == 67) {
					Object[] options = {"Azuria", "Saffronia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s34
						neu = AufbauMap.ALL[33];
					}
					else if (selected == 1) {
						//s38
						neu = AufbauMap.ALL[37];
					}
				}
				break;
			//s59	
			case 59:
				//Ich komme aus Orania
				if(vorher == 41) {
					Object[] options = {"Ereignisfeld", "Fangfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s61
						neu = AufbauMap.ALL[58];
					}
					else if (selected == 1) {
						//s65
						neu = AufbauMap.ALL[63];
					}
				}
				//Ich komme aus Ereignisfeld
				if(vorher == 60) {
					Object[] options = {"Orania", "Fangfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s41
						neu = AufbauMap.ALL[40];
					}
					else if (selected == 1) {
						//s65
						neu = AufbauMap.ALL[63];
					}
				}
				//Ich komme aus Fangfeld
				if(vorher == 64) {
					Object[] options = {"Orania", "Ereignisfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s41
						neu = AufbauMap.ALL[40];
					}
					else if (selected == 1) {
						//s61
						neu = AufbauMap.ALL[59];
					}
				}
			break;
			
			//s62
			case 62:
				//Ich komme aus Fangfeld s61
				if(vorher == 61) {
					Object[] options = {"Fangfeld", "Ereignisfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s66
						neu = AufbauMap.ALL[64];
					}
					else if (selected == 1) {
						//s64
						neu = AufbauMap.ALL[62];
					}
				}
				//Ich komme aus Fangfeld s65
				if(vorher == 65) {
					Object[] options = {"Fangfeld", "Ereignisfeld"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s62
						neu = AufbauMap.ALL[60];
					}
					else if (selected == 1) {
						//s64
						neu = AufbauMap.ALL[62];
					}
				}
				//Ich komme aus Ereignisfeld s63
				if(vorher == 63) {
					Object[] options = {"Fangfeld Orania", "Fangfeld Fuchsania"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s62
						neu = AufbauMap.ALL[60];
					}
					else if (selected == 1) {
						//s66
						neu = AufbauMap.ALL[64];
					}
				}
			break;
			
			//s65
			case 65:
				//Ich komme aus Ereignisfeld s63
				if(vorher == 62) {
					Object[] options = {"Lavandia", "Fuchsania"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s67
						neu = AufbauMap.ALL[65];
					}
					else if (selected == 1) {
						//s69
						neu = AufbauMap.ALL[67];
					}
				}
				//Ich komme aus Fangfeld s68
				if(vorher == 68) {
					Object[] options = {"Lavandia", "Orania"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s67
						neu = AufbauMap.ALL[65];
					}
					else if (selected == 1) {
						//s63
						neu = AufbauMap.ALL[61];
					}
				}
				//Ich komme aus Lavandia
				if(vorher == 66) {
					Object[] options = {"Fuchsania", "Orania"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s69
						neu = AufbauMap.ALL[67];
					}
					else if (selected == 1) {
						//s63
						neu = AufbauMap.ALL[61];
					}
				}
				
			break;
			//s52
			//Abzweigung Fuchsania City
			case 52:
				//Ich komme aus s75
				if(vorher == 75) {
					Object[] options = {"Prismania", "Zinnoberinsel"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s51
						neu = AufbauMap.ALL[50];
					}
					else if (selected == 1) {
						//s53
						neu = AufbauMap.ALL[52];
					}
				}
				//Ich komme aus Prismania
				if(vorher == 51) {
					Object[] options = {"Orania/Lavandia", "Zinnoberinsel"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s76
						neu = AufbauMap.ALL[74];
					}
					else if (selected == 1) {
						//s54
						neu = AufbauMap.ALL[52];
					}
				}
				//Ich komme aus Zinneroberinsel
				if(vorher == 53) {
					Object[] options = {"Prismania", "Orania/Lavandia"};
					int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
		                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
					if (selected == 0) {
						//s51
						neu = AufbauMap.ALL[52];
					}
					else if (selected == 1) {
						//s76
						neu = AufbauMap.ALL[74];
					}
				}
			break;
			
			//Zinnoberinsel ENDE der Map
			case 58:
				//s58
				neu = AufbauMap.ALL[57];
			break;
			//Alabastia Anfang der Map
			case 1:
				//s01
				neu = AufbauMap.ALL[0];
			break;
			case 53:
				//s01
				Object[] options = {"Prismania", "Orania/Lavandia"};
				int selected = JOptionPane.showOptionDialog(null, "Treffen Sie eine Auswahl","Entscheidung",JOptionPane.DEFAULT_OPTION, 
	                    JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				if (selected == 0) {
					//s51
					neu = AufbauMap.ALL[50];
				}
				else if (selected == 1) {
					//s75
					neu = AufbauMap.ALL[74];
				}
			break;
		}
		return neu;
		
	}

}
