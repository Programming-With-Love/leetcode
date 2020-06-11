package LinkedList;

/**
 * @author tujietg
 * @date 6/11/20 2:08 PM
 */
public class Nom24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oneNode = head;
        ListNode twoNode = head.next;

        oneNode.next = swapPairs(twoNode.next);
        twoNode.next = oneNode;
        return twoNode;
    }
}
