
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tujietg on Jan 21, 2020
 */
public class No590 {

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        for (Node node : root.children) {
            preorder(node);
        }
        list.add(root.val);
        return list;
    }

}
