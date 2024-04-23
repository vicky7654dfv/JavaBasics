package graph;

public class GraphMain {

	public static void main(String[] args) {
		GraphLogic gl = new GraphLogic();
		
		gl.insert(0, 2);
		gl.insert(0, 1);
		gl.insert(0, 3);
		gl.insert(2, 6);
		gl.insert(1, 5);
		gl.insert(3, 4);
		
		gl.bfs();
		System.out.println("*************************");
		gl.dfs();

	}

}