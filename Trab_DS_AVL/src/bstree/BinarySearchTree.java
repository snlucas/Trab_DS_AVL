package bstree;

public class BinarySearchTree {
	/**
	 * Object: Some function that will handle data, using BST.
	 */
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

	// Using visitor pattern
    // BST Traverse
    public void inOrder(Object object):
        this.inOrderNode(this.root, object);

    public void inOrderNode(Node node, Object object):
        // Nil is the stop point
        // So, it runs recursively until null
        if(node != null) {
            // Traverse left -> root -> right
            this.inOrderNode(node.left, object);
            f(node.key);
            self.inOrderNode(node.right, object);
		}

    public void preOrder(Object object):
        this.preOrderNode(this.root, object);

    public void preOrderNode(Node node, Object object):
        if(node != null) {:
            // Traverse root -> left -> right
            f(node.key);
            this.pre_order_node(node.left, object);
            this.pre_order_node(node.right, object);
		}

    public void postOrder(Object object):
        this.postOrderNode(this.root, object)

    public void postOrderNode(Node node, Object object):
        if(node != None) {
            // Traverse left -> right -> root
            this.postOrderNode(node.left, object);
            this.postOrderNode(node.right, object);
            f(node.key);
		}

	
	
}
