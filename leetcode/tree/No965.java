
/**
 * No965
 * <p>
 * Created by tujietg on Jan 21, 2020
 */
public class No965 {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != root.val) {
            return false;
        }
        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
