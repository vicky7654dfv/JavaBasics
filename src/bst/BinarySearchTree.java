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
			
		public Node find(int value)
		{
			if(currentRoot == value)
			{
				return true;
			}
			else if(currentRoot!=value)
			{
				currentRoot.left = insert(currentRoot.left, value);	
			}
		}
			
			return currentRoot;
			
		}
		
	}