package bstree;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree(Node root) {
		this.root = null;
	}

	
	public void setRoot(Node node) {
		if(this.root == null)
			this.root = node;
		else
			this.setNode(this.root, node);
	}
	
	public void setNode(Node root, Node node) {
		if(root.getKey() > node.getKey())
			// Check if the left side of the Root is empty
			if(root.getLeft() == null)
				root.setLeft(node);
			else
				this.setNode(root.getLeft(), node);  // Recursively add node
		else
			if(root.getRight() == null)
				root.setRight(node);
			else
				this.setNode(root.getRight(), node);
	}
	
	
}
