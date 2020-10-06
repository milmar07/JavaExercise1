package markomarkovic.exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Marko Markovic
 */
public class Graph {

    private List<Edge> vertices;
    
    
    
    //Basic constructor for Graph
    public Graph(){
    this.vertices = new ArrayList<Edge>();
    }
    
    public int getSize(){
        return this.vertices.size();
    }
    

    
    //For returning the Adjacency Matrix (THIS IS THE MAIN TASK) *************************************
    public Matrix toMatrix(){
        List<String> array = new ArrayList<>();
        for(int i=0; i< this.vertices.size(); i++){
            array.add(this.vertices.get(i).start.label);
            array.add(this.vertices.get(i).end.label);
        }
        
        List<String> newList = array.stream().distinct().collect(Collectors.toList());
        Collections.sort(newList);
        

        //this is the matrix of the positions for each Vertex for example a = position 0, b = position 1 and so on...
        String[][] positions = new String[newList.size()][2];
        for(int j = 0; j<newList.size();j++){
        positions[j][0] = newList.get(j);
        positions[j][1] = Integer.toString(j);
        }
       
        //Creating an matrix that we are going to return
        Matrix adjMatrix = new Matrix(newList.size(),newList.size());
        //Finding the positions of the vertex where they connect and change the values of our adjMatrix to true in the end for those positions.
        for(Edge edges : this.vertices){
            int position1 = 0;
            int position2 = 0;

            for(int i = 0; i<newList.size();i++){
                if(positions[i][0].equals(edges.start.label)){
                    position1 = Integer.parseInt(positions[i][1]);
                }
                if(positions[i][0].equals(edges.end.label)){
                    position2 = Integer.parseInt(positions[i][1]);
                }
            }
            adjMatrix.matrix[position1][position2] = true;
            adjMatrix.matrix[position2][position1] = true;
        }
        return adjMatrix;
    }
    
    
    
    
    
    
    // adding the Edge to the graph
    public void addTo(Edge a){
        this.vertices.add(a);
    }
    
    //For printing the layout of the graph
    public void printGraph(){
        for (int i=0; i<this.vertices.size(); i++) {
            this.vertices.get(i).printEdge();
        }
    }
    
    
    
    
    public static void main(String[] args) throws IOException{
    
        Graph graph = new Graph();
        String line = new String();
        String splitBy = ",";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HAF\\Documents\\GitHub\\JavaSSL\\JavaExercise1\\MarkoMarkovic-Exercise3\\files/triplets.csv"));
            while((line = br.readLine()) != null){
                String[] data = line.split(splitBy);
                Vertex x = new Vertex(data[0]);
                Vertex y = new Vertex(data[2]);
                Edge e = new Edge(x,y,data[1]);
                graph.addTo(e);
            }
            
            
        } catch(IOException e){System.out.println("There was an error");}
        
        //graph.printGraph(); //Just to print out the relations in matrix
        
        //Creating a matrix that is already AdjacencyMatrix
        Matrix matrix = graph.toMatrix();
        //printing the Adjacency Matrix
        matrix.printMatrix();
        
    }
    
}
