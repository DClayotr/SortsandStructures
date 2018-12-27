package LinkedQue;

public class LinkedQue {
	Node Head;
	private Node ToQueue(Node new_Head) {
		if(Head == null) {
			return new_Head;
		}
		Head.Previous = new_Head;
		new_Head.Next = Head;
		return new_Head;
	}
	private Node FromQueue(Node root) {
		if(root == null) {
			System.out.println("Que is empty");
			return root;
		}
		if(root.Next == null) {
			System.out.println("POP: " + root.Value);
			root = root.Previous;
			root.Next = null;
			return root;
		}
		FromQueue(root.Next);
		return root;
	}
	public void Queue(int key) {
		Node NewNode = new Node(key);
		Head = ToQueue(NewNode);
		
	}
	public void Dequeue() {
		Head = FromQueue(Head);
	}
	public void print() {
		PrintQue(Head);
	}
	private void PrintQue(Node root) {
		if(root != null) {
			System.out.print(root.Value);
			PrintQue(root.Next);
		}
	}
	
}
