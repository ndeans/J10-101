package us.deans.javastudy.operations.core10;

import us.deans.javastudy.base.BaseOperation;

public class DmBinaryTreeCheck extends BaseOperation {
	
	class Node {
		public int value;
		public Node left, right;
		
		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
	
	
	public String contains(Node root, int value) {
		
		// String rtn = "false";
		
		if (root.value==value || root.left.value == value || root.right.value == value) 
			return "true";
			// return true;
		
/*		if (root.value > value) 
			return contains(root.left, value);
		
		if (root.value < value) 
			return contains(root.right, value);
*/		
		else return "false";
	}
	
	
	public void start() {
		
		Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
       
        lp.printMsg(contains(n2, 3));
  
       
	}
	
}
