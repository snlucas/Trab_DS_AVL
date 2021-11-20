package bstree;

public class Node {
	private int key;  // Node value
	private Node left;  // Left child pointer reference
	private Node right;  // Right child pointer reference
	
	public Node(int key, Node left, Node right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
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
