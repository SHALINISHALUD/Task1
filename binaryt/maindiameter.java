package binaryt;

public class maindiameter {

		    public static void main(String[] args) {
		    	 diameter tree = new diameter();
		   
		        tree.insertAll();

		        System.out.println("In Order:");
		        tree.inOrder(tree.ob);

		        System.out.println("-------------------");
		        System.out.println("Post Order:");
		        tree.PostOrder(tree.ob);

		       System.out.println("-------------------");
		        System.out.println("Pre Order:");
		        tree.PreOrder(tree.ob);

		        System.out.println("-------------------");
		        System.out.println("Diameter of the tree:");
		        int diameter = tree.Diameter(tree.ob);
		        System.out.println(diameter);
		    

	}

}
