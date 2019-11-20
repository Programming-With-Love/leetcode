package Algorithm.leetcode.Tree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

class TreeNodeInt {
	int val;
	TreeNodeInt left;
	TreeNodeInt right;

	TreeNodeInt(int x) {
		val = x;
	}
}

public class No104 {
	public int maxDepth(TreeNodeInt root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}
