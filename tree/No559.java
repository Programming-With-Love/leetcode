
/**
 * No559
 * <p>
 * Created by tujietg on Jan 22, 2020
 */
public class No559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int end = 0;
        for (Node node : root.children) {
            int value = maxDepth(node);

            if (value > end) {
                end = value;
            }
        }
        return end + 1;
    }
}
