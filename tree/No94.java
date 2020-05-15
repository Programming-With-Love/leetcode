import java.util.ArrayList;
import java.util.List;

/**
 * No94
 * <p>
 * Created by tujietg on Jan 26, 2020
 */
public class No94 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

}


