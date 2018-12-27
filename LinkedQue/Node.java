package LinkedQue;

public class Node {
	Node Next;
	Node Previous;
	int Value;
	Node(int data){
		Value = data;
		Next = null;
		Previous = null;
	}
}
