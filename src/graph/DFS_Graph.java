package graph;
import java.util.*;
public class DFS_Graph {
	private LinkedList<Integer> adjLists[];
	private boolean visited[];
	
	DFS_Graph(int vertices) 
	{
		adjLists=new LinkedList[vertices];
		visited=new boolean[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			adjLists[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int src, int dest)
	{
		adjLists[src].add(dest);
	}
	
	void DFS(int vertex) {
		visited[vertex]=true;
		System.out.print(vertex+" ");
		
		Iterator<Integer> ite=adjLists[vertex].listIterator();
		while(ite.hasNext()) {
			int adj=ite.next();
			if(!visited[adj])
				DFS(adj);
		}
	}
	public static void main(String[] args)
	{
		DFS_Graph g=new DFS_Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(0, 3);
		g.addEdge(2, 4);
		
		System.out.println("Following is Depth First Traversal");
		g.DFS(0);
	}
}
