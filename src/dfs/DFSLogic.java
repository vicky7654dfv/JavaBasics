package dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSLogic {
	DFSNode root;
	public void setRoot(DFSNode root) {
		this.root = root;
	}
	
	public void preOrder(DFSNode child) {
		if(child != null) {
		System.out.print(" "+child.value);
		preOrder(child.left);
		preOrder(child.right);
		}
//		else {
//			return;
//		}
	}
	public void inOrder(DFSNode child) {
		if(child != null) {
		inOrder(child.left);
		System.out.print(" "+child.value);
		inOrder(child.right);
		}
	}
	public void postOrder(DFSNode child) {
		if(child != null) {
			postOrder(child.left);
			postOrder(child.right);
			System.out.print(" "+child.value);
		}
	}
	
	public int height( DFSNode root,int i) {
		
			if(root==null) {
				return i;
			}
			int rightHeight = height(root.right,i+1);
			int leftHeight = height(root.left,i+1);
			if(leftHeight < rightHeight) {
				return rightHeight;
			}
			else {
				return leftHeight;
			}
	}
	
	public void printBFS(DFSNode root) {
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		queue.offer(root);
		while(queue.size()!= 0) {
			DFSNode current = queue.poll();
			System.out.print(current.value+" ");
			
			if(current.left != null) {
				queue.offer(current.left);
			}
			
			if(current.right != null) {
				queue.offer( current.right);				
			}
		}
	}
	
	public int breadth(DFSNode root) {
		if(root == null) {
			return 0;
		}
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		queue.offer(root);
		int maxBreadth =0;
		while(queue.size()!=0) {
			int breadth1 = queue.size();
			 if(breadth1 > maxBreadth) {
				 maxBreadth = breadth1;
			 }
				 while(breadth1 > 0) {
				 DFSNode current = queue.poll();
				 if(current.left != null) {
					 queue.offer(current.left);
				 }
				 if(current.right != null) {
					 queue.offer(current.right);
				 }
				 breadth1--;
			 }
		}
		return maxBreadth;
	}
	
	public DFSNode mirror(DFSNode root) {
	if(root == null) {
		return root;
	}
	
	DFSNode left = mirror(root.left);
	DFSNode right = mirror(root.right);
	
	if(left != null||right != null) {
		root.left = right;
		root.right = left;
	}
	return root;
	}
	
	public ArrayList<int[]>widthtree(DFSNode root,ArrayList<int[]>width,int level){
		if(root==null) {
			return width;
		}
		int[] levelSize = new int[2];
		levelSize[0]=level;
		levelSize[1]=0;
		
		if(root.left != null && root.right != null) {
			levelSize[1]=1;
		}
		else if(root.left != null|| root.right != null) {
			levelSize[1]=1;
		}
		
		width.add(levelSize);
		width = widthtree(root.left,width,level +1);
		width = widthtree(root.right,width,level +1);
		
		return width;
	}
	
	public void print(DFSNode root,int height) {
		
		int n = height *7;
		int mid = n/2;
		int x = 0,y=0;
		
		int leftStar = mid,rightStart = mid;
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(mid==i && j==0) {
					System.out.print(root.value);
				}
				else if(j==0 && i==n-1) {
					System.out.print(root.left.value);
				}
				else if(j ==n-1&& i== n-1) {
					System.out.print(root.right.value);
				}
				else if(leftStar == j || rightStart == j) {
					System.out.print("*");					
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}