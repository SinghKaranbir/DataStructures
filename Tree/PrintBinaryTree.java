
public class PrintBinaryTree {

	public static void main(String[] args){
		BinaryTree tree =  new BinaryTree();
		tree.add(10);
		tree.add(20);
		tree.add(1);
		tree.add(5);
		tree.add(30);
		tree.add(100);
		tree.add(8);
		tree.add(200);
		tree.add(50);

		tree.traverse();
	}
}
