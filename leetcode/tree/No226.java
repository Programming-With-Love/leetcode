
/**
 * Created by tujietg on Nov 6, 2019
 */
public class No226 {
    public TreeNode invertTree(TreeNode root) {
        // 使用遍历交换左子树和右子树
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
