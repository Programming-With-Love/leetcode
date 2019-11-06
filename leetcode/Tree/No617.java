package Algorithm.leetcode.Tree;

/**
 * 
 * Created by tujietg on Nov 6, 2019
 */
public class No617 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		int newval = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

		TreeNode newtree = new TreeNode(newval);

		newtree.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
		newtree.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
		return newtree;
	}
}
