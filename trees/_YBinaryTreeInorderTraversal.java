package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _YBinaryTreeInorderTraversal { // stack package

	public static List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		Stack<TreeNode> stack = new Stack<TreeNode>();

		while (root != null || !stack.isEmpty()) { 

			if (root != null) {
				stack.push(root);
				root = root.left;
				continue; 
			}

			root = stack.pop();
			list.add(root.val);

			root = root.right;
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		root.right = node1;
		TreeNode node2 = new TreeNode(3);
		node1.left = node2;
		
		System.out.println(inorderTraversal(root));

	}

}

/*
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * For example: 
 * 
 * Given binary tree [1,null,2,3],
 * 
 * 		1 
 * 		 \ 
 * 		  2 
 * 		 / 
 * 		3 
 * 
 * return [1,3,2].
 * 
 */
