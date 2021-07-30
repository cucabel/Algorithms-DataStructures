package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class _GMinimumDepthOfBinaryTree {

	public static int minDepth(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<TreeNode>();

		if (root == null)
			return 0;

		q.add(root);

		int depth = 0;

		while (!q.isEmpty()) {

			++depth; 

			int nodesCount = q.size();

			for (int i = 0; i < nodesCount; i++) {
				
				TreeNode node = q.remove();
				
				if (node.left == null && node.right == null)
					return depth;
				
				if (node.left != null)
					q.add(node.left);
				
				if (node.right != null)
					q.add(node.right);
			}

		}
		return depth;
	}

	public static void main(String[] args) {
		
		TreeNode root00 = new TreeNode(5);
		TreeNode node10 = new TreeNode(4);
		TreeNode node11 = new TreeNode(8);
		TreeNode node20 = new TreeNode(11);
		TreeNode node21 = new TreeNode(13);
		TreeNode node22 = new TreeNode(4);
		TreeNode node30 = new TreeNode(7);
		TreeNode node31 = new TreeNode(2);
		TreeNode node32 = new TreeNode(5);
		TreeNode node33 = new TreeNode(1);
		root00.left = node10;
		root00.right = node11;
		node10.left = node20;	
		node11.left = node21;
		node11.right = node22;
		node20.left = node30;
		node20.right = node31;
		node22.left = node32;
		node22.right = node33;
/*		
		  			5 						
		  	  	   / \ 						
		  	 	  4   8 					
		  		 /   / \ 
		  		11   13  4 					
		 	   /  \	    / \ 
		  	  7    2   5   1 
*/
		System.out.println(minDepth(root00));
	}
}

/*
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 * 
 */
