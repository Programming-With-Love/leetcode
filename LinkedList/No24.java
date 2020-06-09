package LinkedList;

/**
 * @author tujietg
 * @date 6/9/20 8:50 AM
 */
public class No24 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);

        head.next.next = head;

        head.next = null;
        return cur;
    }

}
