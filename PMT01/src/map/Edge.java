package map;

public class Edge {
	public final Vertex target;
	public final int weight;
	
	public Edge(Vertex argTarget) {
	target = argTarget;
	weight = 1;
	}
}
