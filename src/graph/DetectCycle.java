package graph;

import java.util.*;

public class DetectCycle {
	private final int V;
	private final List<List<Integer>> adj;
	
	public DetectCycle(int V) {
		this.V=V;
		adj=new ArrayList<>(V);
		for(int i=0;i<V;i++) {
			adj.add(new LinkedList<>());
		}
	}
	private void addEdge(int source, int dest) {
		adj.get(source).add(dest);
	}
	private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
		if(recStack[i])
			return true;
		if(visited[i])
			return false;
		visited[i]=true;
		recStack[i]=true;
		List<Integer> children=adj.get(i);
		for(int c: children) {
			if(isCyclicUtil(i,visited,recStack))
				return true;
		}
		recStack[i]=false;
		return false;
	}
	
	private boolean isCyclic() {
		boolean[] visited=new boolean[V];
		boolean[] recStack=new boolean[V];
		for(int i=0;i<V;i++)
			if(isCyclicUtil(i,visited,recStack))
				return true;
		return false;
	}
	public static void main(String[] args) {
		DetectCycle dc=new DetectCycle(4);
		dc.addEdge(0,1);
		dc.addEdge(1,2);
		dc.addEdge(0,2);
		dc.addEdge(2,0);
		dc.addEdge(2,3);
		dc.addEdge(3,3);
		if(dc.isCyclic())
			System.out.println("Graph contains Cycle");
		else
			System.out.println("Graph doesn't ");
	}
}