/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class No101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isM(root.left, root.right);
    }

    public boolean isM(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if ((r1 == null && r2 != null) || (r1 != null && r2 == null)) {
            return false;
        }
        return (r1.val == r2.val && isM(r1.left, r2.right) && isM(r1.right, r2.left));
    }
}
