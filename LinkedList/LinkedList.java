package linkListAssgnment;

public class LinkedList {
	public LinkedListEntry head = null;
	public LinkedListEntry current = null;

	
	public void insert(int key) {
		LinkedListEntry newLink = new LinkedListEntry(key);
		LinkedListEntry previous = null;
		LinkedListEntry current = head;

		while (current != null && key > current.data) {
			previous = current;
			current = current.next;
		}

		if (current == null) {
			head = newLink;
		} else if (previous == null && current != null) {
			previous = newLink;
			newLink.next = current;
			head = previous;
		} else {
			newLink.next = current;
			previous.next = newLink;
		}
	}

	public void displayLinkList() {

		System.out.println("The List is : \n");
		LinkedListEntry temp = head;
		do {
			temp.display();
			temp = temp.next;
		} while (temp != null);

		System.out.print(" \n");
	}

	public LinkedListEntry DeleteKey(int key) {
		LinkedListEntry current = head;
		LinkedListEntry previous = head;
		while (current.data != key) {
			if (current.next == null) {
				System.out.println("The Key with given value " + key
						+ " is not found");
				return null;

			}

			else {
				previous = current;
				current = current.next;
			}
		}
		if (current == head) {
			head = head.next;
		}

		else {
			previous.next = current.next;

		}
		return current;

	}

}