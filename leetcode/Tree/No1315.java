package Algorithm.leetcode.Tree;

/**
 * No1315
 * 
 * Created by tujietg on Jan 20, 2020
 */
public class No1315 {
	public int sumEvenGrandparent(TreeNode root) {
		return helper(root, 1, 1);
	}

	public int helper(TreeNode node, int p, int gp) {
		if (node == null) {
			return 0;
		}
		return helper(node.left, node.val, p) + helper(node.right, node.val, p) + (gp % 2 == 0 ? node.val : 0);
	}
}
