package graph;

import java.util.ArrayList;

public class Edges {
          int source;
		int destination;
          public Edges(int source , int destination) {
        	  this.source = source;
        	  this.destination = destination;
        	  
          }
          public int getDestination() {
			return destination;
		}
          public int getSource() {
			return source;
		}
          public void setDestination(int destination) {
			this.destination = destination;
		}
          public void setSource(int source) {
			this.source = source;
		}
}
