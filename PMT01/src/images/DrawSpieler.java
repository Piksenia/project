package images;


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class DrawSpieler extends JPanel{
	public static int player1X = 0;
	public static int player1Y = 0;
	public static int player2X = 0;
	public static int player2Y = 0;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color farbe = Color.GREEN;

	public DrawSpieler(String farbe) {
		switch(farbe) {
			case "red":
				this.farbe = Color.RED;
			break;
			case "blue":
				this.farbe = Color.BLUE;

			break;
			case "yellow":
				this.farbe = Color.YELLOW;
			break;
			case "black":
				this.farbe = Color.BLACK;

			break;	
			default:
				this.farbe = Color.GREEN;
		}
        //setOpaque(false);
	}

	
	

    @Override
    public Dimension getPreferredSize() {
    	Dimension d = new Dimension(790, 890);
    	
        return d;
    }
    @Override
	protected void paintComponent(Graphics g) {
   
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setComposite(AlphaComposite.getInstance(
            AlphaComposite.SRC_OVER, 0.3f));
        g2d.setColor(this.farbe);
        g2d.fillOval(player1X, player1Y, 30, 30);
    
    }
    
    
	}
    


