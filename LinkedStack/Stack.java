package LinkedStack;

public class Stack {
	public Node Head;
	private Node ToStack(Node New_Head) {
		New_Head.next = Head;
		return New_Head ;
	}
	private Node FromStack(Node root) {
		if(root == null) {
			System.out.println("Stack is empty: Cannor delete from empty stack");
			return root;
		}
		root = Head.next;
		if(root != null)	{
			System.out.println("POP: " +  Head.value);
		}else {
			System.out.println("Stack was emptied");
		}
		Head = null;
		return root;
		
	}
	private void printout(Node temp_head) {	
		if(temp_head != null) {
			
			System.out.print( temp_head.value + ", " );
			printout(temp_head.next);
		}
	}
	public void print() {
		if(Head == null) {
			System.out.println("Stack is empty");
		}
		printout(Head);
	}
	public void peek() {
		System.out.println("Peek: " +  Head.value);
	}
	public void Push(int key) {
		Node NewNode = new Node(key);
		Head = ToStack(NewNode);
	}
	public void Pop() {
		Head = FromStack(Head);
	}
}
