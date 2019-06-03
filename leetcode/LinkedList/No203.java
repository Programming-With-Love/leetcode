package Algorithm.leetcode.LinkedList;

public class No203 {
	public ListNode removeElements(ListNode head, int val) {
		ListNode prehead = new ListNode(-1);
		prehead.next = head;
		ListNode cur = head, pre = prehead;
		while (cur != null) {
			if (cur.val == val) {
				pre.next = cur.next;
			} else {
				pre = pre.next;
			}
			cur = cur.next;
		}
		return prehead.next;
	}
}
