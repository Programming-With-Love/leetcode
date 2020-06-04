package tree;

/**
 * @author tujietg
 * @date 6/4/20 2:58 PM
 */
public class Nom28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }

    boolean check(TreeNode rootLeft, TreeNode rootRight) {
        if (rootLeft == null && rootRight == null) {
            return true;
        }
        if (rootLeft == null || rootRight == null) {
            return false;
        }
        return rootLeft.val == rootRight.val && check(rootLeft.left, rootRight.right) && check(rootLeft.right, rootRight.left);
    }
}
