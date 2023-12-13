package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphLogic {

	HashMap<Integer, ArrayList<Edges>> vertices = new HashMap<Integer,ArrayList<Edges>>();
	//Edges [] edgesArr = new Edges[8];
	//int vertices ;
	//public GraphLogic(int vertices) {
		//this.vertices = vertices;
		
//	}
	public void addEdge(int source,int destination) {
		Edges edge = new Edges(source,destination);
		ArrayList<Edges>edges;
		if(vertices.get(source)!=null)
			edges = vertices.get(source);
		else
			edges = new ArrayList<Edges>();
		edges.add(edge);
	vertices.put(source, edges);	
	if(!vertices.containsKey(destination)) {
		vertices.put(destination,new ArrayList<Edges>());
	}
	}
	public void BFS(int startvalue) {
		HashMap<Integer,Boolean>verified = new HashMap<Integer,Boolean>();
		vertices.keySet().forEach(key ->{
			verified.put(key,false);
		});
	Queue<Integer> queue = new LinkedList<>();
	queue.add(startvalue);
	verified.put(startvalue, true);
		while(queue.size()!=0) {
			startvalue = queue.poll();
			System.out.println(startvalue);
			ArrayList<Edges> startNodeEdges = vertices.get(startvalue);
			for(int i=0;i<startNodeEdges.size();i++) {
			int destinationvalue = startNodeEdges.get(i).getDestination();
			if(!verified.get(destinationvalue)) {
			verified.put(destinationvalue, true);
			queue.add(destinationvalue);
				}
			}
		
	}
}
	public void DFS_Recursion(int startvalue,HashMap<Integer, Boolean>verified) {
		ArrayList<Edges>startNodeEdges = vertices.get(startvalue);
		System.out.println(startvalue);
		for(int i=0;i<startNodeEdges.size();i++) {
			int destinationvalue = startNodeEdges.get(i).getDestination();
			if(!verified.get(destinationvalue)) {
			verified.put(destinationvalue, true);
			DFS_Recursion(destinationvalue,verified);
				}
			}
	
	}
	public void DFS(int startvalue) {
		HashMap<Integer,Boolean>verified = new HashMap<Integer,Boolean>();
		vertices.keySet().forEach(key ->{
			verified.put(key,false);
		});
		verified.put(startvalue, true);
		DFS_Recursion(startvalue,verified);
			
		
	}
}