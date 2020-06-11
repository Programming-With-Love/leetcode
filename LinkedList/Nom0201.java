package LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tujietg
 * @date 6/11/20 2:54 PM
 */
public class Nom0201 {

    public ListNode removeDuplicateNodes(ListNode head) {

        Map<Integer, Integer> map = new HashMap<>();

        ListNode preNode = head;
        ListNode lastNode = null;

        while (preNode != null) {
            if (!map.containsKey(preNode.val)) {
                map.put(preNode.val,1);
                lastNode = preNode;
                preNode = preNode.next;
            }else {
                preNode = preNode.next;
                lastNode.next = preNode;
            }
        }
        return head;
    }
}
