package depthFirstSearch;

import java.util.LinkedList;
import java.util.List;

public class _YPathSumII { 

	public static List<List<Integer>> pathSum(TreeNode root, int sum) { 

		List<List<Integer>> result = new LinkedList<>();
		List<Integer> currentResult = new LinkedList<>();

		pathSum(root, sum, currentResult, result); 

		return result;
	}

	public static void pathSum(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result) {  
																												  
		if (root == null) 
			return; 

		currentResult.add(new Integer(root.val)); 

		if (root.left == null && root.right == null && sum == root.val) { 

			result.add(new LinkedList<>(currentResult)); 

			currentResult.remove(currentResult.size() - 1); 
															
			return;											
			
		} else {
			
			pathSum(root.left, sum - root.val, currentResult, result); 

			pathSum(root.right, sum - root.val, currentResult, result); 

		}

		currentResult.remove(currentResult.size() - 1); 
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
		
		System.out.println(pathSum(root00, 22));
	}
}

/*
 * Given a binary tree and a sum, find all root-to-leaf paths where each
 * path's sum equals the given sum.
 * 
 * For example: Given the below binary tree and sum = 22, 
 * 
 * 			5 					
 * 	  	   / \ 
 * 	 	  4   8 
 * 		 /   / \ 
 * 		11   13  4 
 *	   /  \	    / \ 
 * 	  7    2   5   1 
 * 
 * return 
 * [ 
 * 		[5,4,11,2],
 * 		[5,8,4,5] 
 * ]
 *
 */
