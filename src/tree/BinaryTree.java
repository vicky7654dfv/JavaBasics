package tree;

class Node
{
	int data;
	Node leftChild,rightChild;
	
	Node(int item) 
{
		data=item;
		leftChild=rightChild=null;
}
}

public class BinaryTree 
{
	Node root;
	
	boolean isFullBinaryTree(Node node) 
	{
		if(node==null)
			return true;
		
		if(node.leftChild==null && node.rightChild==null)
			return true;
		
		if((node.leftChild!=null) && (node.rightChild!=null))
			return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));
		
		return false;
	}
	
	public static void main(String args[])
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.leftChild=new Node(2);
		tree.root.rightChild=new Node(3);
		tree.root.leftChild.leftChild=new Node(4);
		tree.root.leftChild.rightChild=new Node(5);
		tree.root.leftChild.rightChild.leftChild=new Node(6);
		tree.root.leftChild.rightChild.rightChild=new Node(7);
		
		if(tree.isFullBinaryTree(tree.root))
			System.out.print("The tree is a binary tree");
		else
			System.out.print("The tree is not a full binary tree");
	}
}