package binarySearchTree;

public class BinarySearchTree {

	Node root;

	public void insertNumber(int key) {
		root = insert(root, key);
		System.out.println(root.data);
	}

	public static Node insert(Node bNode, int value) {
		if (bNode == null) {
			Node node = new Node();
			System.out.println(node);
			return node;

		} else {
			if (value < bNode.data)
				bNode.left = insert(bNode.left, value);
			else
				bNode.right = insert(bNode.right, value);
		}
		System.out.println(bNode);
		return bNode;
	}

	public static Node insertBst(int value,Node current) {
		if(current == null)
		{
			Node newNode = new Node(value);
			return newNode;
		}
		else
		{
			if(value < current.data)
				current.left = insertBst(value, current.left);
			else
				current.right = insertBst(value, current.right);
		}	
		
		return current;
	}

	public static void main(String[] args) {
		Node root = new Node(12);
		root = insertBst(7, root);
		root = insertBst(20, root);
		root = insertBst(5, root);
		root = insertBst(9, root);
	    root = insertBst(21, root);

	}
}
