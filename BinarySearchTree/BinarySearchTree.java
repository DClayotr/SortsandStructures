package DataStructures;

public class BinarySearchTree {
	public Node root;
	BinarySearchTree(){
		root = null;
	}
	Node insertRec(Node temp_root, int key) {
		   
	        /* If the tree is empty, return a new node */
	      if (temp_root == null) {
	          temp_root = new Node(key);
	          return temp_root;
	      }
	 
	        /* Otherwise, recur down the tree */
	      if (key < temp_root.value)
	          temp_root.Left = insertRec(temp_root.Left, key);
	      else if (key > temp_root.value)
	    	  temp_root.Right = insertRec(temp_root.Right, key);
	 
	        /* return the (unchanged) node pointer */
	      return temp_root;
	 }
	void insert(int key) {
		root = insertRec(root, key);
	}
	 // This method mainly calls InorderRec()
    void inorder()  {
       inorderRec(root);
    }
 
    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.Left);
            System.out.println(root.value);
            inorderRec(root.Right);
        }
    }
	
}
