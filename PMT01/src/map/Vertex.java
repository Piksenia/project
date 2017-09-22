package map;

public class Vertex {
	public final String name, farbe;
	public int xko, yko;
	public Edge[] adjacencies;
	
	public Vertex(String argName, String ffarbe, int x, int y) { 
		name = argName; 
		farbe =ffarbe; 
		this.xko = x; 
		this.yko = y; 
	}
}
