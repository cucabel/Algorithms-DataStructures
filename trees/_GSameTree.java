package trees;

//import javax.swing.tree.TreeNode;

public class _GSameTree { // DFS package

	public static boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;

		if (p == null || q == null)
			return false;

		if (p.val != q.val)
			return false;

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	
	public static void main(String[] args) {
		
		TreeNode rootp = new TreeNode(3);
		TreeNode rootpLeftChild = new TreeNode(1);
		TreeNode rootpRigthChild = new TreeNode(5);
		rootp.left = rootpLeftChild;
		rootp.right = rootpRigthChild;
		
		TreeNode rootq = new TreeNode(3);
		TreeNode rootqLeftChild = new TreeNode(1);
		TreeNode rootqRigthChild = new TreeNode(5);
		rootq.left = rootqLeftChild;
		rootq.right = rootqRigthChild;
		
		System.out.println(isSameTree(rootp, rootq));
		
	}

}

/*
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * 
 */
