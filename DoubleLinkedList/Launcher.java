package DoubleLinkedList;

public class Launcher {
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.add(7);
		list.add(9);
		list.add(23);
		list.insertion(5, 9);
		list.HeadInsert(18);
		list.printout();
	}
}
