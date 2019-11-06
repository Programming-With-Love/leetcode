package Algorithm.leetcode.Tree;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No110 {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (depth(root.left) - depth(root.right) > 1 || depth(root.right) - depth(root.left) > 1) {
			return false;
		}
		return isBalanced(root.right) && isBalanced(root.left);
	}

	// 求出子树的高度
	public static int depth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		// 通过递归来求出每个子树的高度
		return Math.max(depth(root.left), depth(root.right)) + 1;
	}
}
