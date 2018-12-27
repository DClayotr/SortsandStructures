package DoubleLinkedList;

public class DoubleLinkedList {
	Node Head;
	
	private Node add(int value, Node node, Node PreviousNode) {
		if(node == null) {
			node = new Node(value);
			node.Previous = PreviousNode;
			return node;
		}
		node.Next = add(value, node.Next, node);
		return node;
		
	}
	private Node insertHead(Node new_head) {
		Head.Previous = new_head;
		new_head.Next = Head;
		return new_head;
	}
	public void HeadInsert(int key) {
		Node NewNode = new Node(key);
		Head = insertHead(NewNode);
	}
	private int insert(int where, Node temp_node, Node root, Node PreviousNode) {
		if(root.Value == where) {
			temp_node.Next = root.Next;
			root.Next.Previous = temp_node;
			root.Next = temp_node;
			temp_node.Previous = root;
			return 1;
		}
		
		insert(where, temp_node, root.Next, root);
		return 0;
	}
	public void insertion(int key, int where) {
		Node NewNode = new Node(key);
		insert(where, NewNode, Head, Head);
	}
	public void add(int key) {
		Head = add(key, Head, Head);
	}
	public void printout() {
		print(Head);
		printback(Head);
	}
	private void print(Node root) {
		if(root != null) {
			System.out.print(root.Value);
			if(root.Next != null) {	
				System.out.println(" next: " + root.Next.Value);
			}else {
				System.out.println(" next: null");
			}
			print(root.Next);
		}
		
	}
	private void printback(Node root) {
		if(root != null) {
			if(root.Previous != null) {
				System.out.println(root.Value + ": Previous :" + root.Previous.Value);
			}else {
				System.out.println(root.Value + ": Previous : null");
			}
			printback(root.Next);
		}
	}
}
