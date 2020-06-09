package LinkedList;

/**
 * @author tujietg
 * @date 6/9/20 8:48 AM
 */
public class No1290 {
    public int getDecimalValue(ListNode head) {
        int end = 0;
        while (head != null) {
            end = end * 2 + head.val;
            head = head.next;
        }
        return end;
    }

}
