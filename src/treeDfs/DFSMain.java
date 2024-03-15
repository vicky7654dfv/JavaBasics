package treeDfs;

import java.util.ArrayList;

public class DFSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSNode root = new DFSNode(11);
		root.left = new DFSNode(2);
		root.right = new DFSNode(8);
		root.left.left = new DFSNode(6);
		root.left.right = new DFSNode(21);
		root.left.left.left = new DFSNode(4);
		root.left.left.right = new DFSNode(7);
		root.left.right.right = new DFSNode(8);
		root.right.left = new DFSNode(3);
		root.right.right = new DFSNode(7);
		root.right.left.right = new DFSNode(14);
		root.right.right.left = new DFSNode(29);
		root.right.right.left.right = new DFSNode(16);
		
		DFSLogic dfsLogic = new DFSLogic();
		System.out.println("************PRE-ORDER***********");
		dfsLogic.preOrder(root);
		System.out.println();
		System.out.println("************IN-ORDER************");
		dfsLogic.inOrder(root);
		System.out.println();
		System.out.println("************POST-ORDER************");
		dfsLogic.postOrder(root);
		System.out.println();
		System.out.print("Height: "+dfsLogic.height(root));
		System.out.println();
		dfsLogic.printBFD(root);
		System.out.println();
		DFSNode mirrorRoot = dfsLogic.mirror(root);
		
		System.out.println();
		System.out.println("Width: "+dfsLogic.width(root));
		
		dfsLogic.printTree(root, dfsLogic.height(root), dfsLogic.width(root));
		
		ArrayList<int[]> width1 = dfsLogic.withTree(mirrorRoot, new ArrayList<int[]>(), 0);
		int[] levelBasewidth = new int[dfsLogic.height(mirrorRoot)+1];
		
		for(int i = 0; i< levelBasedwidth.length; i++) {
			int j = width.get(i)[0];
			levelBasedwidth[j] = levelBasedwidth[j] + width.get(i)[1];
		}
		int maxWidth = 0;
		for(int i=0;i<levelBasedwidth.length; i++)
		{
			if(maxWidth<levelBasedwidth[i]) {
				maxWidth=levelBasedwidth[i];
			}
		}
		System.out.println("Max width :"+maxWidth);
	}

}