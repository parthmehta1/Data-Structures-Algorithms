package graph_DFS_V1;

public class Vertex 
{
	public char nodeName;
	public boolean nodeVisited;
	
	public Vertex(char nodeName)
	{
		this.nodeName = nodeName;
		nodeVisited = false;
	}
}
