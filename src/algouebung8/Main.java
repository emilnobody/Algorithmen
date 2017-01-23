/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algouebung8;

import com.sun.javafx.geom.Curve;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.omg.PortableServer.LifespanPolicy;

/**
 *
 * @author emil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GraphLesenOwn graphLesen = new GraphLesenOwn();
        File file4 = new File("src/algouebung8/BeispieleGewichtet/graph8_4.txt");
        File file2 = new File("src/algouebung8/BeispieleGewichtet/graph8_2.txt");
        File file5 = new File("src/algouebung8/BeispieleGewichtet/graph8_5.txt");
        File fileNeu = new File("src/algouebung8/BeispieleGewichtet/graphwsu_neu.txt");
        PriorityQueue<VertexDist> weight = new PriorityQueue<VertexDist>();
        
        
        //*************TEST FÜR graphwsu_neu.txt also dem Folienbeispiel******/
        GraphOwn graphwsu_neu;
        graphwsu_neu = graphLesen.FileToWeightedGraphOwn(fileNeu.toString(), true);
        try {
            DijkstraAlgorithmusPQ dijkstra = new DijkstraAlgorithmusPQ(graphwsu_neu, weight, graphwsu_neu.getVertexDist(0));
            System.out.println("*** TEST FÜR graphwsu_neu****");
            dijkstra.executeDijkstra();
            for (VertexDist vertexDist : dijkstra.getVisitedPQ()) {

                dijkstra.getPath(vertexDist);
            }
            System.out.println("***ENDE VON TEST FÜR graphwsu_neu****");
            System.out.println("\n");
        } catch (NegativeEdgeException ex) {
            System.out.println(ex.getMessage());
            System.err.println("" + ex.getMessage());
            System.err.printf("" + ex.getMessage() + "\n");
        }
        //*************TEST FÜR graph8_5  das wo alle zur null führen******/
        GraphOwn graph8_5;
        graph8_5 = graphLesen.FileToWeightedGraphOwn(file5.toString(), true);
        try {
            DijkstraAlgorithmusPQ dijkstra = new DijkstraAlgorithmusPQ(graph8_5, weight, graph8_5.getVertexDist(0));
            System.out.println("***TEST FÜR graph8_5****");
            dijkstra.executeDijkstra();
            for (VertexDist vertexDist : dijkstra.getVisitedPQ()) {

                dijkstra.getPath(vertexDist);
            }
            System.out.println("***ENDE VON TEST FÜR graph8_5****");
            System.out.println("\n");
        } catch (NegativeEdgeException ex) {
            System.out.println(ex.getMessage());
            System.err.println("" + ex.getMessage());
            System.err.printf("" + ex.getMessage() + "\n");
        }
        //*************TEST FÜR graph8_2******/
        GraphOwn graph8_2;
        graph8_2 = graphLesen.FileToWeightedGraphOwn(file2.toString(), true);
        try {
            DijkstraAlgorithmusPQ dijkstra = new DijkstraAlgorithmusPQ(graph8_2, weight, graph8_2.getVertexDist(0));
            System.out.println("***TEST FÜR graph8_2****");
            dijkstra.executeDijkstra();
            for (VertexDist vertexDist : dijkstra.getVisitedPQ()) {

                dijkstra.getPath(vertexDist);
               
            }
            System.out.println("***ENDE VON TEST FÜR graph8_2****");
            System.out.println("\n");
        } catch (NegativeEdgeException ex) {
            System.out.println(ex.getMessage());
            System.err.println("" + ex.getMessage());
            System.err.printf("" + ex.getMessage() + "\n");
        }
        //*************TEST FÜR graph8_4 hier wird eine Exception Geworfen FIle mit negativen Kanten******/
        GraphOwn graph8_4;
        
        graph8_4 = graphLesen.FileToWeightedGraphOwn(file4.toString(), true);
        try {
            DijkstraAlgorithmusPQ dijkstra = new DijkstraAlgorithmusPQ(graph8_4, weight, graph8_4.getVertexDist(0));
            System.out.println("*** TEST FÜR graph8_4****");
            dijkstra.executeDijkstra();
            for (VertexDist vertexDist : dijkstra.getVisitedPQ()) {

                dijkstra.getPath(vertexDist);
            }
            System.out.println("***ENDE VON TEST FÜR graph8_4****");
            System.out.println("\n");
        } catch (NegativeEdgeException ex) {
            ex.getMessage();
            System.err.printf("AHTUNG!!!"+ "\n");
            System.out.print(ex);
            System.err.printf("" + ex+""+ "\n");
        }
    }
       

}
