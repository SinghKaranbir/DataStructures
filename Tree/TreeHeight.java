public class TreeHeight{

	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.add(5);
		tree.add(2);
		tree.add(10);
		tree.add(20);
		tree.add(40);
		tree.add(60);

		System.out.println("Height of Binary Tree is: " + getHeight(tree.root));
	}

	/**
	* Get the height of binary search tree
	* node here should be rootNode
	**/
	private static int getHeight(Node node){
		if(node == null) return 0;
		return 1 + Math.max(getHeight(node.leftChild), getHeight(node.rightChild));
	}
}