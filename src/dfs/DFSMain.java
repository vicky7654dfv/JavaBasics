package dfs;

import java.util.ArrayList;

public class DFSMain {

	public static void main(String[] args) {
		DFSNode root =new DFSNode(2);
		root.left = new DFSNode(3);
		root.right = new DFSNode(5);
		root.left.left=new DFSNode(6);
		root.left.right=new DFSNode(9);
		root.left.left.left = new DFSNode(7);
		root.left.left.right=new DFSNode(11);
		root.left.left.right.left=new DFSNode(2);
		root.left.left.right.left.right=new DFSNode(4);
		root.left.right.left = new DFSNode(21);
		root.right.left=new DFSNode(12);
		root.right.right=new DFSNode(18);
		root.right.left.left=new DFSNode(16);
		root.right.left.right=new DFSNode(11);
		root.right.right.left=new DFSNode(5);
		root.right.right.right=new DFSNode(19);
		root.right.right.left.left=new DFSNode(10);
		
		DFSLogic dfsLogic=new DFSLogic();
		System.out.println("******************** preOrder ***********************");
		dfsLogic.preOrder(root);
		System.out.println();
		System.out.println("******************** inOrder ************************");
		dfsLogic.inOrder(root);
		System.out.println();
		System.out.println("******************** postOrder **********************");
		dfsLogic.postOrder(root);
		System.out.println();
		System.out.println("******************** height *************************");
		System.out.println(dfsLogic.height(root, 0)); 
		System.out.println("******************** BFS *************************");
		dfsLogic.printBFS(root);
		DFSNode mirriorRoot = dfsLogic.mirror(root);
		System.out.println();
		System.out.println("******************** Mirror *************************");
		dfsLogic.preOrder(mirriorRoot);
		System.out.println();
		System.out.println("************************max Breadth********************");
		System.out.println(dfsLogic.breadth(root));
		System.out.println();
		System.out.println("**************************Max Breadth***********************");
		
		ArrayList<int[]> width = dfsLogic.widthtree(mirriorRoot, new ArrayList<int[]>(), 0);
		int[] levelBasedWidth = new int[dfsLogic.height(mirriorRoot, 0)+1];
		
		for(int i =0;i<width.size();i++) {
			int j = width.get(i)[0];
			levelBasedWidth[j]= levelBasedWidth[j]+ width.get(i)[1];
		}		
		int maxWidth = 0;
		for(int i = 0; i<levelBasedWidth.length;i++) {
			if(maxWidth < levelBasedWidth[i]) {
			maxWidth = levelBasedWidth[i];
			}
		}
		System.out.println("Max width :"+maxWidth);
		
		System.out.println("***********************Tree Structure****************************");
		dfsLogic.print(mirriorRoot, maxWidth);
	}	
}