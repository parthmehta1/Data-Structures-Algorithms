package krskl;

public class Graph 
{
	private final int maximumNumber = 20;
	private final int infinite = 1000000;
	private Vertex vertexList[];
	private int adjacent[][];
	private int presNumOfVertex;
	private int currentVertex;
	private PriorityQue p;
	private int nTree;
	public Edge e;
	public Graph()
	{

	vertexList = new Vertex[maximumNumber];
	adjacent = new int[maximumNumber][maximumNumber];
	presNumOfVertex = 0;
	for(int j=0; j<maximumNumber; j++) 
	for(int k=0; k<maximumNumber; k++)
	adjacent[j][k] = infinite;
	p = new PriorityQue();
	}
	public void addVertex(char lab)
	{
	vertexList[presNumOfVertex++] = new Vertex(lab);
	}
	public void addEdge(int start, int end, int weight)
	{
	adjacent[start][end] = weight;
	adjacent[end][start] = weight;
	}
	public void displayVertex(int v)
	{
	System.out.print(vertexList[v].label);
	}
	
	public void kruskalLogic()
	{
		
	currentVertex = 0;
	while(nTree < presNumOfVertex-1)
	{ 
	vertexList[currentVertex].isInTree = true;
	nTree++;
	for(int j=0; j<presNumOfVertex; j++)
	{
	if(j==currentVertex)
	continue;
	if(vertexList[j].isInTree)
	continue;
	int distance = adjacent[currentVertex][j];
	if( distance == infinite) 
	continue;
	putInPQ(j, distance);
	}
if(p.size()==0)
	{
	System.out.println("GRAPH NOT CONNECTED");
	return;
	}
	Edge theEdge = p.deleteMin();
	int sourceVert = theEdge.startPoint;
	currentVertex = theEdge.endPoint;
	System.out.print( vertexList[sourceVert].label );
	System.out.print( vertexList[currentVertex].label );
	
	System.out.print("\n");
	} 
	for(int j=0; j<presNumOfVertex; j++)
	vertexList[j].isInTree = false;
	}
	public void putInPQ(int newVert, int newDist)
	{
	int queueIndex = p.find(newVert);
	if(queueIndex != -1) 
	{
	Edge tempEdge = p.peekN(queueIndex);
	int oldDist = tempEdge.weight;
	if(oldDist > newDist)
	{
	p.deleteNtItem(queueIndex); 
	Edge theEdge =
	new Edge(currentVertex, newVert, newDist);
	p.insert(theEdge);
	}
	} 
	else 
	{
	Edge theEdge = new Edge(currentVertex, newVert, newDist);
	p.insert(theEdge);
	}
	}	
	}
	

