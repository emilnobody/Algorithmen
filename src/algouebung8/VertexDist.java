package algouebung8;

/**
 * Eine Klasse, die Knoten eines Graphen repr�sentiert
 *
 * @author ripphausen
 * @version 1.0
 */
public class VertexDist extends Vertex implements Comparable{

    private int id;
    private double distance ;
    private VertexDist prevVertex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VertexDist getPrevVertex() {
        return prevVertex;
    }

    public void setPrevVertex(VertexDist prevVertex) {
        this.prevVertex = prevVertex;
    }

    public VertexDist(int id) {
        super(id);
        this.id = id;
        this.distance = Double.POSITIVE_INFINITY;
    }

//    public VertexDist(int id) {
//        super(id);
//    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
//    public int compareTo(VertexDist otherVertex) {
//        return this.getId() - otherVertex.getId();
//    }

   public Double compareDistance(Vertex otherVertex) {
        return this.getDistance() - otherVertex.getDistance();
    }

//    @Override
//    public int compareTo( Object  other ) {
//        Double thisVertex=  this.getDistance();
//        VertexDist vertexTemp = (VertexDist) other;
//        Double otherVertex = vertexTemp.getDistance();
//        return thisVertex.intValue() - otherVertex.intValue();
//    }
@Override
    public int compareTo( Object  other ) {
        Double thisVertex=  this.getDistance();
        VertexDist vertexTemp = (VertexDist) other;
        Double otherVertex = vertexTemp.getDistance();
        return thisVertex.compareTo(otherVertex);
    }
   
}
