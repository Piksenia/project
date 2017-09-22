package map;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import entity.Spieler;
import images.DrawSpieler;
import mapaction.SpielAktiv;
import mapaction.Spielvorbereitung;



public class Window extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage img = null;

	ArrayList<Spieler> spieler = Spielvorbereitung.beginn("Red", "Glumanda", "Blue", "Schiggy");
	
	public Window()  throws Exception{
		setTitle("Pokemon Meister Trainer - Online by Piksenia");
		img = ImageIO.read(getClass().getResource("/map/board_colored_small.png"));
		
		DrawSpieler p1 = new DrawSpieler("red");
		DrawSpieler p2 = new DrawSpieler("blue");
		JPanel jp = new JPanel(new BorderLayout());
		
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        setContentPane(new JLabel(new ImageIcon(img)));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        pack();

        setLocationRelativeTo(null);
        setVisible(true);
        add(p1,gbc);
        
        new Thread() {
        	@Override
			public void run() {
        		try {
					draw();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        	
        }.start();
	}
	
	private void draw() throws InterruptedException {
		while(true) {
			Thread.sleep(1000);
			game(spieler.get(0));

			try {
	            System.out.println("inside thread");
	            Thread.sleep(1000);
	        } 
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			/*game(spieler.get(1));

			try {
	            System.out.println("inside thread");
	            Thread.sleep(2000);
	        } 
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }*/
		}
	}
	
	public void repaintWindow() {
		repaint();
	}
	
	public void game(Spieler sp) {

				 
					boolean spielfluss = true;
					int zaehler = 0;
					
							++zaehler;
							System.out.println("Runde "+zaehler+ ": ////////////");
							SpielAktiv.zug(sp);
							//SpielAktiv.zug(spieler.get(1));
							System.out.println();
							repaintWindow();
							Object[] options = {"Nächste Runde", "Beenden"};
							int selected = JOptionPane.showOptionDialog(null, "Möchten Sie das Spiel beenden? ","Quit Game",JOptionPane.DEFAULT_OPTION, 
					                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
							if (selected == 0) {
								;
							}
							else if(selected == 1) {
								System.exit(0);
							}					
						
	}
	
	

}
