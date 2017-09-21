package map;

public class Vertex {
	public final String name, farbe;
	public int xko, yko;
	public Edge[] adjacencies;
	public double minDistance = Double.POSITIVE_INFINITY;
	public Vertex previous;
	public Vertex(String argName, String ffarbe, int x, int y) { name = argName; farbe =ffarbe; this.xko = x; this.yko = y; }
	@Override
	public String toString() { return name; }
	public int compareTo(Vertex other) {
	return Double.compare(minDistance, other.minDistance);

	}
}
