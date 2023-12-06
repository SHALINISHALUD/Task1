package binaryt;

	public class diameter {
		    public class TreeNode {
		        int data;

		        public TreeNode left, right;

		        public TreeNode(int data) {
		            this.data = data;
		        }

		    }

			public static final String TreeNode = null;

		    TreeNode ob;

		    public TreeNode insertAll() {
		    	 ob = new TreeNode(38);
			        ob.left = new TreeNode(27);
			        ob.right = new TreeNode(25);
			        ob.left.left = new TreeNode(20);
			        ob.left.right = new TreeNode(18);
			        ob.left.left.left = new TreeNode(55);
			        ob.left.left.right = new TreeNode(24);
			        //ob.left.left.left.left=new TreeNode(5);
			        //ob.left.left.left.right=new TreeNode(29);

			        //ob.left.left.right=new TreeNode(31);
			        //ob.left.left.right.left=new TreeNode(9);


			        ob.left.right.left = new TreeNode(28);
			        

			        ob.right.left = new TreeNode(45);
			        ob.right.right = new TreeNode(32);

			        ob.right.left.left = new TreeNode(39);
			        ob.right.left.right = new TreeNode(8);
			        ob.right.left.right.right = new TreeNode(12);
			        ob.right.left.right.right.left = new TreeNode(9);

			        ob.right.right.left = new TreeNode(13);
			        ob.right.right.right = new TreeNode(16);

			        ob.right.right.right.left = new TreeNode(6);
			        ob.right.right.right.right = new TreeNode(4);

		      
		        return ob;
		    }

		    public void inOrder(diameter.TreeNode currRoot) {

		        if (currRoot != null) {
		            inOrder(currRoot.left);
		            System.out.println(currRoot.data);
		            inOrder(currRoot.right);
		        }
		    }

		    public void PreOrder(diameter.TreeNode currRoot) {

		        if (currRoot != null) {
		            System.out.println(currRoot.data);
		            PreOrder(currRoot.left);
		            PreOrder(currRoot.right);
		        }
		    }

		    public void PostOrder(diameter.TreeNode currRoot) {

		        if (currRoot != null) {
		            PostOrder(currRoot.left);
		            PostOrder(currRoot.right);
		            System.out.println(currRoot.data);
		       }
		   }
		    /*public Boolean Search(TreeNode root, int value) {
		    	if(root==null) {
				return false;
				
			}
		if (root.data== value) {
			return true;
		}else {
			
			return Search(root.left,value) || Search(root.right,value);
		}
			
		}
		
	}*/
	 public int Diameter(diameter.TreeNode root) {
		        if (root == null) {
		            return 0;
		        }
		        int leftHeight = Diameter(root.left);
		        int rightHeight = Diameter(root.right);
		        
		        int leftDiameter = Diameter(root.left);
		        int rightDiameter = Diameter(root.right);

		    
		        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter , rightDiameter));
	 }
		        
		        
		        private int Height(TreeNode node) {
		            if (node == null) {
		                return 0;
		            }
		            return 1 + Math.max(Height(node.left), Height(node.right));
		        }
		    
		    
	}


