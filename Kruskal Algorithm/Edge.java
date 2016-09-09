package krskl;

public class Edge 
{
	public int startPoint;
	public int endPoint; 
	
	public int weight; 
	public Edge(int sv, int dv, int d)
	{
	startPoint = sv;
	endPoint = dv;
	weight = d;
	}
	public Edge()
	{
		startPoint = 0;
		endPoint = 0;
		weight= 0;
	}
} 