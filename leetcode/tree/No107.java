import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * No107题解
 * <p>
 * Created by tujietg on Jan 20, 2020
 */
public class No107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> midList = new ArrayList<Integer>();
            for (int i = 0; i < length; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                midList.add(queue.poll().val);
            }
            result.add(0, midList);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        new No107().levelOrderBottom(root);
    }

}
