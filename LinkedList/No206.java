package LinkedList;

public class No206 {
	// 迭代
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode tem = null;
		ListNode newList = null;
		while (head != null) {
			tem = head.next;
			head.next = newList;
			newList = head;
			head = tem;
		}
		return newList;
	}

	// 递归
	public ListNode reverseList01(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newList = reverseList01(head.next);
		head.next.next = head;
		head.next = null;
		return newList;
	}
}
