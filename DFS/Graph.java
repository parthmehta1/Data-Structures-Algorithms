package graph_DFS_V1;

public class Graph 
{
		public int max_Limit = 20;
		public Vertex vertexList[];
		public int adjMatrix [][]; 
		public int currentVertices;
		public Stack stack;
		
		public Graph()
		{
			vertexList = new Vertex[max_Limit];
			adjMatrix = new int [max_Limit][max_Limit];
			currentVertices = 0;
			for (int j=0; j<max_Limit;j++)
				for (int k=0; k<max_Limit; k++)
					adjMatrix[j][k] = 0;
			stack = new Stack();
		}
		
		public void addVertex(char nodeName)
		{
			vertexList[currentVertices++] = new Vertex(nodeName);
		}
		
		public void addEdge(int edgeStart, int edgeEnd)
		{
			adjMatrix[edgeStart][edgeEnd] = 1;
			adjMatrix[edgeEnd][edgeStart] = 1;
		}
		
		public void displayVertex(int ver)
		{
			System.out.println(vertexList[ver].nodeName);
			//System.out.println(vertexList[ver]);
		}
		
		public void DFS()
		{
			vertexList[0].nodeVisited = true;
			displayVertex(0);
			stack.push(0);
			
			while(!stack.isEmpty())
			{
				int v  = getAdjUnvisitedVertex(stack.getTop());
				if(v == -1)
				{
					stack.pop();
				}
				else
				{
					vertexList[v].nodeVisited = true;
					displayVertex(v);
					stack.push(v);
				}
			}
			for(int i = 0; i<currentVertices;i++)
				vertexList[i].nodeVisited = false;
			
		}
		public int getAdjUnvisitedVertex(int v)
		{
			for (int i=0; i<currentVertices;i++)
			{
				if(adjMatrix[v][i] == 1 && vertexList[i].nodeVisited == false)
				{
					return i;
				}
				
			}
			return -1;
		}
}

