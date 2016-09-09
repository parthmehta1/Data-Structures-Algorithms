package graph_DFS_V1;

public class DFS_Main 
{
	public static void main(String[] args) 
	{
		Graph graph = new Graph();
		graph.addVertex('x');
		graph.addVertex('s');
		graph.addVertex('w');
		graph.addVertex('y');
		graph.addVertex('v');
		graph.addVertex('t');
		graph.addVertex('z');
		graph.addVertex('u');
		graph.addVertex('p');
		graph.addVertex('q');
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(0, 3);
		graph.addEdge(0, 5);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 0);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 2);
		graph.addEdge(5, 4);
		graph.addEdge(6, 3);
		graph.addEdge(6, 5);
		graph.addEdge(7, 4);
		graph.addEdge(7, 5);
		graph.addEdge(6, 8);
		graph.addEdge(8, 9);
		graph.addEdge(9, 7);
		graph.addEdge(9, 6);
		System.out.println("The result of DFS for the entered graph is:\n");
		graph.DFS();
	}
}
