package LinkedList;

/**
 * @author tujietg
 * @date 6/11/20 11:37 AM
 */
public class Nom27 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a1 = headA, b1 = headB;
        while (a1 != b1) {
            if (a1 == null) {
                a1 = headB;
            } else {
                a1 = a1.next;
            }

            if (b1 == null) {
                b1 = headA;
            } else {
                b1 = b1.next;
            }
        }
        return a1;
    }
}
