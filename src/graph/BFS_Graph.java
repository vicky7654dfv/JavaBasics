package graph;
import java.util.*;
public class BFS_Graph 
{
	private int V;
	private LinkedList<Integer> adj[];
	
	BFS_Graph(int v)
	{
		V=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList();
	}
	
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	
	void BFS(int s) 
	{
		boolean visited[]=new boolean[9];
		LinkedList<Integer> queue=new LinkedList();
		visited[s]=true;
		queue.add(s);
		
		while(queue.size() !=0)
		{
			s=queue.poll();
			System.out.println(s+" ");
			
			Iterator<Integer> i=adj[s].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		BFS_Graph g=new BFS_Graph(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		
		System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
		g.BFS(2);
	}
}