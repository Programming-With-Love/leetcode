package Algorithm.leetcode.Tree;

/**
 * 
 * Created by tujietg on Jan 12, 2020
 */
public class No404 {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null)
			return 0;
		int answer = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				answer += root.left.val;
			} else {
				answer += sumOfLeftLeaves(root.left);
			}
		}
		answer += sumOfLeftLeaves(root.right);
		return answer;
	}
}
