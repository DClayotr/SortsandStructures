package LinkedStack;

public class Launcher {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.Pop();
		stack.Push(5);
		stack.Pop();
		stack.Push(6);
		stack.Push(7);
		stack.Push(8);
		stack.Push(9);
		stack.Pop();
		stack.Push(12);
		stack.Push(13);
		stack.Pop();
		stack.print();
		stack.peek();
	}
}
