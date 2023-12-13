package graph;

import java.util.HashMap;

public class GraphMain {

	public static void main(String[] args) {
		
		GraphLogic graphlogic = new GraphLogic();
		graphlogic.addEdge(3,7);
		graphlogic.addEdge(3,6);
		graphlogic.addEdge(3,2);
		graphlogic.addEdge(7,4);
		graphlogic.addEdge(7,2);
		graphlogic.addEdge(6,2);
		graphlogic.addEdge(4,9);
		graphlogic.addEdge(2,9);
		//graphlogic.print();
		System.out.println("***********BFS***********");
		graphlogic.BFS(3);
		System.out.println("***********DFS***********");
		graphlogic.DFS(3);
	
		
	}

}
