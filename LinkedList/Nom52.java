package LinkedList;

/**
 * @author tujietg
 * @date 6/11/20 3:41 PM
 */
public class Nom52 {
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
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA;
            ListNode b = headB;

            while (a != b) {
                if (a != null) {
                    a = a.next;
                } else {
                    a = headB;
                }

                if (b != null) {
                    b = b.next;
                } else {
                    b = headA;
                }
            }
            return a;
        }
    }
}
