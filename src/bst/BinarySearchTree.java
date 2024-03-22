package bst;

public class BinarySearchTree {

	Node root=null;
	
		public Node insert(int value)
		{
			if(root==null)
			{
				root=new Node(value);
				return root;
			}
			else
			{
				return insert(root, value);
			}
		}
			
		public Node insert(Node currentRoot, int value) {
			
			if(currentRoot == null)
			{
				Node newNode = new Node(value);
				return newNode;
			}
			if(value <= currentRoot.value)
			{
				System.out.println("parent : "+currentRoot.value+" left:"+value);
				currentRoot.left = insert(currentRoot.left, value);
			}
			else if(value>currentRoot.value)
			{
				System.out.println("parent : "+currentRoot.value+" right:"+value);
				currentRoot.right = insert(currentRoot.right, value);
			}
			return currentRoot;
			
		}
		
		public boolean find(int value) {
			if(find(root,value)==null) {
				System.out.println("False value :"+value);
				return false;
			}else {
				System.out.println("True value :"+value);
				return true;
			}
		}
		
		public Node find(Node currentNode,int value)
		{
			if(currentNode == null)
			 return null;
			if(currentNode.value == value)
			 return currentNode;
			else if(currentNode.value > value)
			 return find(currentNode.left,value);
			else
		     return find(currentNode.right,value);
		}		
		
		public Node delete(Node currentNode,int value)
		{
			if(root==null)
			{
				root=new Node(value);
				return root;
			}
			else
			{
				return insert(root, value);
			}
			
		}
}