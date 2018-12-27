package LinkedQue;

public class Launcher {

	public static void main(String[] args) {
		LinkedQue que = new LinkedQue();
		que.Dequeue();
		que.Queue(5);
		que.Queue(6);
		que.Queue(7);
		que.Dequeue();
		que.Queue(8);
		que.Queue(9);
		que.Dequeue();
		que.print();
	}

}
