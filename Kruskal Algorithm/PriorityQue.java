package krskl;

public class PriorityQue {
	
	private final int size = 20;
	private Edge[] queArray;
	private int size1;
	public PriorityQue()
	{
	queArray = new Edge[size];
	size1 = 0;
	}

	public void insert(Edge item) 
	{
	int j;
	for(j=0; j<size1; j++)
	if( item.weight >= queArray[j].weight )
	break;
	for(int k=size1-1; k>=j; k--)
	queArray[k+1] = queArray[k];
	queArray[j] = item; 
	size1++;
	}
	
	public Edge deleteMin()
	{
		return queArray[--size1];
	}
	
	public void deleteNtItem(int n) 
	{
	for(int j=n; j<size1-1; j++) 
	queArray[j] = queArray[j+1];
	size1--;
	}
	public Edge peekMin()
	{
		return queArray[size1-1];
	}
	public int size()
	{ 
		return size1;
	}
	public boolean isEmpty()
	{ 
		return (size1==0); 
	}
	public Edge peekN(int n)
	{ 
		return queArray[n]; 
	}
	public int find(int findDex) 
	{ 
	for(int j=0; j<size1; j++)
	if(queArray[j].endPoint == findDex)
	return j;
	return -1;
	}

}
