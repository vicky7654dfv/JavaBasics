package treeDfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSLogic {
	DFSNode root;
	
	public void setRoot(DFSNode root)
	{
		this.root=root;
	}
	
	public void preOrder(DFSNode child)
	{
	if(child != null)
	{
		System.out.print("  "+child.value);
		preOrder(child.left);
		preOrder(child.right);
	}
	}
	
	public void inOrder(DFSNode child)
	{
	if(child != null)
	{
		inOrder(child.left);
		System.out.print("  "+child.value);
		inOrder(child.right);
	}
	}
	
	public void postOrder(DFSNode child)
	{
	if(child != null)
	{
		postOrder(child.left);
		postOrder(child.right);
		System.out.print("  "+child.value);
	}
	}
	
	public int height(DFSNode root)
	{
		if(root == null)	
	    	return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(rh>lh)
			return rh+1;
		else
			return lh+1;	
	}
	
	public void printBFD(DFSNode root)
	{
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		queue.offer(root);
//		while (queue.size() != null)
		{
			DFSNode current = queue.poll();
			System.out.println(current.value);
			
			if(current.left != null)
			{
				queue.offer(current.left);
			}
			
			if(current.right != null)
			{
				queue.offer(current.right);
			}
		}
	}
	
	public DFSNode mirror(DFSNode root)
	{
		if(root==null)
			return root;
		
	    DFSNode left=mirror(root.left);
		DFSNode right=mirror(root.right);
		
		if(left != null || right != null)
		{
			root.left = right;
			root.right = left;
		}
		return root;	
	}
	
	public int width(DFSNode root)
	{
		if(root == null)
			return 0;
		else
		{
		int wide = 0;
			for(int i=1;i<=height(root);i++)
			{
				wide = width(root.left)+width(root.right);
			}
			return wide;
		}
	}
	
	public void printTree(DFSNode root, int height, int width)
	{
		for(int i=width;i<height;i++)
		{
			System.out.println(root);
		}	
	}
	
	public ArrayList<int[]> width1(PreInPost_Order root, ArrayList<int[]> width){
        if (root == null) {
            return width;
            
        }
        int[] level_size = new int[2];
        level_size[0] = level;
        level_size[1] = 0;
        
        if(root.left != null && root.right != null)
        level_size[1] = 2;
        level_size[1] = 1;
        
        width.add(level_size);
        width = WidthTree(root.left, width, level +1);
        width = WidthTree(root.right, width, level +1);

        
        return width;

    }
	
	public void star(DFSNode root,int height)
	{
		int n=height*7;
		int mid=n/2;
		int x=0,y=0;
		int leftStar =mid,rightStart=mid;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			if(mid==i && j==0) 
			{
				System.out.print(root.value);
		    }
			else if(j==0 && i==n-1) 
			{
				System.out.println(root.left.value+" ");
			}
			else if(j==n-1 && i==n-1)
			{
				System.out.print(root.right.value+" ");
			}
			else if(leftStar==j || rightStart==j)
			{
				System.out.println(" * ");
			}
			System.out.println("");
			
			leftStar--;
			rightStart++;
	   }
	}
}