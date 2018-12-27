package linkedList;

public class linkedlist {
	public Node Head;
	
	private Node add(int value, Node temp_head) {
		if(temp_head == null) {
			temp_head = new Node(value);
			return temp_head;
		}
		temp_head.next = add(value, temp_head.next);
		return temp_head;
	}
	private int insert(int where, Node temp_node, Node root) {
		if(root.value == where) {
			temp_node.next = root.next;
			root.next = temp_node;
			return 1;
		}
		insert(where, temp_node, root.next);
		return 0;
	}
	private Node insertHead(Node New_Head) {
		New_Head.next = Head;
		return New_Head;
	}
	public void publicAdd(int key) {
		Head = add(key, Head);
	}
	public void AddHead(int key) {
		Node NewNode = new Node(key);
		Head = insertHead(NewNode);
	}
	public void insert(int where, int key) {
		Node newNode = new Node(key);
		insert(where, newNode, Head);
		
	}
	private void PrintOut(Node temp_head) {
		if(temp_head != null) {
			
			System.out.print( temp_head.value + ", " );
			PrintOut(temp_head.next);
		}
	}
	public void CallPrint() {
		PrintOut(Head);
	}
	
}
