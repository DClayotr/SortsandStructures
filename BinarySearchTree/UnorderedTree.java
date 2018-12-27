package DataStructures;

public class UnorderedTree {
	private Node root;
	public UnorderedTree() {
		root = null;
	}
	private Node insertUnordered(Node temp_root, int value) {
		
		if(temp_root == null) {
			temp_root = new Node(value);
			return(temp_root);
		}
		
		if(temp_root.Left == null) {
			temp_root.Left = insertUnordered(temp_root.Left, value);
			
		}else if(temp_root.Right == null) {
			temp_root.Right = insertUnordered(temp_root.Right, value);
		}else {
			if(temp_root.Left.Left == null) {
				temp_root.Left.Left = insertUnordered(temp_root.Left.Left, value);
				
			}else if(temp_root.Right.Left == null) {
				temp_root.Right.Left = insertUnordered(temp_root.Right.Left, value);
			}else {
				if(temp_root.Left.Right == null) {
					temp_root.Left.Right = insertUnordered(temp_root.Left.Right, value);
					
				}else if(temp_root.Right.Right == null) {
					temp_root.Right.Right = insertUnordered(temp_root.Right.Right, value);
				}
			}
		}
		
		
		
		return(temp_root);
	}
	public void insert(int key) {
		root = insertUnordered(root, key);
	}
	public void PrintOut() {
		//System.out.println("top");
		unorderedPrint(root);
		//System.out.println("Bottom");
	}
	private void unorderedPrint(Node temp_root) throws NullPointerException {
		
		//if(temp_root != null) {
			
			try {
				System.out.println("Left: " + temp_root.Left.value);
				unorderedPrint(temp_root.Left);
				
			}catch(NullPointerException e) {
				System.out.println("------");
			}try {
				System.out.println("Right: " + temp_root.Right.value);
				unorderedPrint(temp_root.Right);
			}catch(NullPointerException e) {
				System.out.println("------");
			}
			
			
		//}
		
	}
}
