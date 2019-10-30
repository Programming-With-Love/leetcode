package Algorithm.leetcode.String;

/**
 * @author tujietg
 * @date 2019/9/10 10:02 AM
 */

class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class No606 {

	public static void main(String[] args) {
		TreeNode t = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(4);

		t.left = t1;
		t.right = t2;
		t.left.left = t3;

		String result = Solution.tree2str(t);
		// System.out.println(result);

	}

	public static class Solution {
		public static String tree2str(TreeNode t) {
			if (t == null) {
				return "";
			}
			String result = t.val + "";
			String left = tree2str(t.left);
			String right = tree2str(t.right);

			if (left == "" && right == "") {
				return result;
			}
			if (left == "") {
				return result + "()" + "(" + right + ")";
			}
			if (right == "") {
				return result + "(" + left + ")";
			}
			return result + "(" + left + ")" + "(" + right + ")";
		}
	}

}
