package operations;

import base.Operation;
import support.LogPrinter;

public class BinaryTreeCheck implements Operation {

	LogPrinter lp;
	
	
	class Node {
		public int value;
		public Node left, right;
		
		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
	
	
	public boolean contains(Node root, int value) {
		
		if (root.value==value || root.left.value == value || root.right.value == value) 
			return true;
		
/*		if (root.value > value) 
			return contains(root.left, value);
		
		if (root.value < value) 
			return contains(root.right, value);
*/		
		else return false;
	}
	
	
	public void start() {
		
		Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        System.out.println(contains(n2, 3));
        
		
	}
	
	
}
