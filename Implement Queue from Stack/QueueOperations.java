package assignment.queuestack;

public class QueueOperations {
	Stack ob1 = new Stack(20);
	Stack ob2 = new Stack(20);
	public int top;
	public int StackSize;

	public QueueOperations() {
		top = -1;
		StackSize = -1;
	}

	public boolean Enqueue(int QueueVar) {
		boolean Ret = true;
		ob1.push(new Integer(QueueVar));
		System.out.println("Enqueued " + QueueVar + " to Queue");
		return Ret;

	}

	public int Dequeue() {
		top = -1;
		while (!ob1.isempty()) {
			ob2.push(ob1.pop());
		}
		top = ob2.pop();
		while (!ob2.isempty()) {
			ob1.push(ob2.pop());
		}
		System.out.println("Dequeued " + top + " from Queue");
		return top;
	}
}
