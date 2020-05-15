
import java.util.LinkedList;
import java.util.Queue;

/**
 * No1302
 * <p>
 * Created by tujietg on Jan 20, 2020
 */
public class No1302 {
    public int deepestLeavesSum(TreeNode root) {
        int reslut = 0, i;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (i = len - 1, reslut = 0; i >= 0; i--) {
                TreeNode node = queue.poll();
                reslut += node.val;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
        return reslut;
    }
}
