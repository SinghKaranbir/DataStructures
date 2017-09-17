public class BinaryTree {
	
	public Node root;

	/**
	* Add data to Binary Tree
	**/
	public void add(int data){
		if(root == null){
			Node node = new Node(data);
			root = node;
		}else{
			add(data, root);
		}
	}

	/**
	* Traverse the binary tree
	**/
	public void traverse(){
		if(root == null){
			System.out.println("Empty Tree");
		}else{
			postOrderTraversal(root);
		}
		
	}

	
    /**
   	* Check if the current node is empty / null.
	* Display the data part of the root (or current node).
	* Traverse the left subtree by recursively calling the pre-order function.
	* Traverse the right subtree by recursively calling the pre-order function.
	**/
	private void preOrderTraversal(Node node){
		if(node == null) return;

		System.out.println(node.val);
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}

	/**
	* Check if the current node is empty / null.
	* Traverse the left subtree by recursively calling the in-order function.
	* Display the data part of the root (or current node).
	* Traverse the right subtree by recursively calling the in-order function.
	**/
	private void inOrderTraversal(Node node){
		if(node.leftChild != null) {
			inOrderTraversal(node.leftChild);
		}

		System.out.println(node.val);

		if(node.rightChild != null){
			inOrderTraversal(node.rightChild);
		}
	}

	/**
	* Check if the current node is empty / null.
	* Traverse the left subtree by recursively calling the post-order function.
	* Traverse the right subtree by recursively calling the post-order function.
	* Display the data part of the root (or current node).
	**/
	private void postOrderTraversal(Node node){
		if(node == null) return;
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		System.out.println(node.val);
	}
	/**
	* Adds the data at respective node
	**/
	private void add(int data, Node node){
		if(node.val < data){
			if(node.rightChild == null){
				node.rightChild = new Node(data);
			}else{
				add(data,node.rightChild);
			}
		}else{
			if(node.leftChild == null){
				node.leftChild = new Node(data);
			}else{
				add(data,node.leftChild);
			}
		}
	}


}