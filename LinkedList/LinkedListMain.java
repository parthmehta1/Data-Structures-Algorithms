package linkListAssgnment;

public class LinkedListMain {


	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.insert(100);
		linkedList.insert(5);
		linkedList.insert(80);
		linkedList.DeleteKey(80);
		linkedList.DeleteKey(200);
		linkedList.displayLinkList();
		linkedList.insert(40);
		linkedList.insert(60);
		linkedList.displayLinkList();
		linkedList.insert(25);
		linkedList.insert(17);
		linkedList.insert(80);
		linkedList.displayLinkList();
	}

}
