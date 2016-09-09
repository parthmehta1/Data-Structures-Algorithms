package linkListAssgnment;

public class LinkedListEntry {
	public int data;
	public LinkedListEntry next;

	public LinkedListEntry(int data) {
		this.data = data;
	}

	public void display() {
		System.out.print(" " + data + " ");
	}
}
