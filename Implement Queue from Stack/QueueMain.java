package assignment.queuestack;

public class QueueMain {


	public static void main(String[] args) {
	QueueOperations ob = new QueueOperations();
	
	ob.Enqueue(10);
	ob.Enqueue(20);
	ob.Dequeue();
	ob.Enqueue(30);
	ob.Enqueue(40);
	ob.Dequeue();
	ob.Enqueue(50);
	ob.Dequeue();
	ob.Enqueue(60);
	ob.Dequeue(); 

}

}