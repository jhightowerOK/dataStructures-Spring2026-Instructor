package tree;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree() {
		this.root=null;
	}
	
	public void insert(int data) {
		root = insertRecursive(root,data); //Maintains Root
	}

	private Node insertRecursive(Node root, int data) {
		//**Base Case
		if(root==null) {
			root = new Node(data);
			return root;
		}
		
		//**Recursive Case
		if(data<root.data) {
			root.left = insertRecursive(root.left,data);
		}else {
			if(data > root.data) {
				root.right = insertRecursive(root.right,data);	
			}
		}
		return root;
	}
	
	public void inOrderTraversal(Node root) {
		// Left-Root-Right
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.printf(" %d ", root.data);
			inOrderTraversal(root.right);
		}
	}
	
	public void preOrderTraversal(Node root) {
		// Left-Root-Right
		if(root!=null) {
			System.out.printf(" %d ", root.data);
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
		}
	}
	
	public void postOrderTraversal(Node root) {
		// Left-Root-Right
		if(root!=null) {
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			System.out.printf(" %d ", root.data);
		}
	}
}
