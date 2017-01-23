package algouebung8;

/**
 * Eine Klasse, die Knoten eines Graphen repr�sentiert
 *
 * @author ripphausen
 * @version 1.0
 */
public class Vertex {

    private int id;
    private Double distance;
    private Double prevVertex;

    public Vertex(int id) {
        this.id = id;
        this.distance = Double.POSITIVE_INFINITY; 
        this.prevVertex = null;
    }

//    public Vertex(int id) {
//        this.id = id;
//    }

    public int getId() {
        return id;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String toString() {
        return new Integer(id).toString();
    }

    public int compareTo(Vertex otherVertex) {
        return this.getId() - otherVertex.getId();
    }
}
