package LinkedList;

/**
 * @author tujietg
 * @date 6/9/20 8:49 AM
 */
public class Nom22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        while (p != null) {
            head = head.next;
            p = p.next;
        }
        return head;
    }
}
