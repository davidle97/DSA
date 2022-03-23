package Graph;

public class Main {
    public static void main(String[] args){
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("B","C");
        myGraph.printGraph();
        System.out.println("----------");


        myGraph.removeEdge("A","B");
        myGraph.printGraph();

        myGraph.removeVertex("C");
        myGraph.printGraph();

    }
}
