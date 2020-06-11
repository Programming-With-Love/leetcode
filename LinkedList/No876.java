package LinkedList;

/**
 * @author tujietg
 * @date 6/11/20 9:38 AM
 */
public class No876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
