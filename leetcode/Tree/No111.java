package Algorithm.leetcode.Tree;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No111 {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left == 0 || right == 0) ? left + right + 1 : Math.min(left + 1, right + 1);
	}
}
