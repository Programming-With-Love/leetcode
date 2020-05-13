
import java.util.ArrayList;
import java.util.List;

/**
 * No145 Created by tujietg on Feb 5, 2020
 */
public class No145 {
    List<Integer> result = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return result;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }
}
