package bst;

public class Node {
	int value;
	Node right;
	Node left;
	
	public Node(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	
}