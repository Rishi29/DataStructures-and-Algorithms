package linkedlistint;

public class Run {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(12);
		list.insert(14);
		list.insert(16);
		list.insert(18);
		list.show();
		System.out.println("line break ");
		list.insertAtStart(23);
		list.show();
		
		list.insertAt(2, 15);
		System.out.println("line break ");
		list.show();
		
		list.insertAt(0, 10);
		System.out.println("line break ");
		list.show();
		
		list.delete(3);
		System.out.println("line break ");
		list.show();
	}

}
