
/**
 * Created by tujietg on Nov 6, 2019
 */
public class No110 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int a = depth(root.left);
        System.out.println(a);
        int b = depth(root.right);
        System.out.println(b);
        return Math.abs(a - b) <= 1;
    }

    // 求出子树的高度
    public static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 通过递归来求出每个子树的高度
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    // [1,2,2,3,null ,null,3, 4,null,null,4]
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = null;
        root.right.left = null;
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);
        System.out.println(isBalanced(root));
    }

}
