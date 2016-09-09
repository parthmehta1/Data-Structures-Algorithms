package krskl;

public class MainApplication {
	
	public static void main(String[] args)
	{
	Graph graph = new Graph();
	graph.addVertex('A'); 
	graph.addVertex('B'); 
	graph.addVertex('C'); 
	graph.addVertex('D'); 
	graph.addVertex('E'); 
	graph.addVertex('F'); 
	graph.addVertex('G');
	graph.addVertex('H');
	graph.addVertex('I');
	graph.addVertex('J');
	
	graph.addEdge(0, 1, 33); 
	graph.addEdge(0, 2, 10); 
	graph.addEdge(0, 3, 56);
	graph.addEdge(1, 3, 13); 
	graph.addEdge(1, 4, 21); 
	graph.addEdge(2, 3, 23);
	graph.addEdge(2, 5, 24); 
	graph.addEdge(2, 6, 65); 
	graph.addEdge(3, 4, 51); 
	graph.addEdge(3, 6, 20); 
	graph.addEdge(4, 7, 35); 
	graph.addEdge(4, 6, 17); 
	graph.addEdge(5, 6, 40); 
	graph.addEdge(5, 8, 72);
	graph.addEdge(6, 7, 99); 
	graph.addEdge(6, 8, 45); 
	graph.addEdge(6, 9, 42); 
	graph.addEdge(7, 9, 38);
	graph.addEdge(8, 9, 83); 
	
	System.out.print("After Kruskal's Algorithm, the edges are:\n");
	graph.kruskalLogic();
	System.out.println(" ");
	}

}
