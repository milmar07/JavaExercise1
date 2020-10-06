package markomarkovic.exercise3;

/**
 *
 * @author Marko Markovic
 */
class Edge {
    public Vertex start;
    public Vertex end;
    public int weight;

    
    // Basic contructor for Edge
    Edge(Vertex x, Vertex y, String string) {
        this.start = x;
        this.end = y;
        this.weight = Integer.parseInt(string);
    }
    
    // Printing the Edge with all of its atributes
    public void printEdge(){
        this.start.printVertex();
        System.out.print(" , " + this.weight + " , ");
        this.end.printVertex();
        System.out.println();
    }
}
