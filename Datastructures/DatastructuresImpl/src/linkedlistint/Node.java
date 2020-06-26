package linkedlistint;

public class Node {

	int data;
	Node next;

	public Node(int data, Node nxt) {

		this.data = data;
		this.next = nxt;

	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
