package DataStructures;

public class TreeLauncher {

	public static void main(String[] args) {
	
		UnorderedTree tree = new UnorderedTree();
		String Deserialize = "80,90,20,75,1,88,99,76";
		Split(tree, Deserialize);
	}

	public static void Split(UnorderedTree temp_tree, String Sequence) {
		String[] arr = Sequence.split(",", -2);
		int i = 0;
		for (String a : arr) {
            i = Integer.parseInt(a);
			temp_tree.insert(i);
			
		}
		temp_tree.PrintOut();
	}
}
