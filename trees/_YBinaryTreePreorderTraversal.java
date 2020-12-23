package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _YBinaryTreePreorderTraversal {

	public static List<Integer> preorderTraversal(TreeNode node) {
		List<Integer> list = new LinkedList<Integer>();
		Stack<TreeNode> rights = new Stack<TreeNode>();
		while (node != null) {
			
			list.add(node.val);
			
			if (node.right != null)
				rights.push(node.right);
			
			node = node.left;
			
			if (node == null && !rights.isEmpty()) 
				node = rights.pop();

		}
		
		return list;
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		root.right = node1;
		TreeNode node2 = new TreeNode(3);
		node1.left = node2;
		
		System.out.println(preorderTraversal(root));
	}

}

/*
 * Problem 
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * For example: 
 * Given binary tree {1,#,2,3}, 
 * 
 * 		1 
 * 		 \ 
 * 		  2 
 * 		 / 
 * 		3 
 * 
 * return [1,2,3].
 * 
 * Note: Recursive solution is trivial, could you do it iteratively? 
 * 
 */



