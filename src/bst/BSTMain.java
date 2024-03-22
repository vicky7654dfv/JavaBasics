package bst;

public class BSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree ob=new BinarySearchTree();
		ob.insert(21);
		ob.insert(10);
		ob.insert(14);
		ob.insert(22);
		ob.insert(30);
		ob.insert(23);
		ob.insert(19);
		ob.insert(28);
		ob.insert(20);
		ob.insert(10);
		
		ob.find(23);
		ob.find(6);

	}

}