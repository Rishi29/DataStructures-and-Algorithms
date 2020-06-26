package linkedlistint;

public class LinkedList {

	Node head;

	public void insert(int data) {

		Node newNode = new Node(data, null);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
	}

	public void insertAtStart(int data) {
		Node newNode = new Node(data, null);
		Node current = head;
		head = newNode;
		head.next = current;

	}

	public void insertAt(int index, int data) {

		Node newNode = new Node(data, null);
		Node current = head;

		if (index == 0) {
			insertAtStart(data);
		} else {

			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}

			newNode.next = current.next;
			current.next = newNode;
		}
	}

	/**
	 * @param index
	 */
	public void delete(int index) {

		if (head == null) {
			return;
		}

		if (index == 0) {
			head = head.next;
			return;
		} else {

			Node current = head;
			for (int i = 0; i < index - 1; i++) {

				current = current.next;
			}
			current.next = current.next.next;

			return;
		}

	}

	public void show() {

		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
