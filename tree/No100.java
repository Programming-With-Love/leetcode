class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class No100 {
    static int i = 0;

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        System.out.println(++i);

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        boolean taga = isSameTree(p.left, q.left);

        boolean tagb = isSameTree(p.right, q.right);

        if (p.val == q.val) {
            return taga && tagb;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        isSameTree(root1, root2);
    }
}
