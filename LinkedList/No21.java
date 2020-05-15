package Algorithm.leetcode.LinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

// 递归
public class No21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode node = null;
		if (l1.val < l2.val) {
			node = l1;
			node.next = mergeTwoLists(l1.next, l2);
		} else {
			node = l2;
			node.next = mergeTwoLists(l1, l2.next);
		}
		return node;
	}

	public ListNode mergeTwoLists01(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = new ListNode(-1);
		ListNode node = head;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				node.next = l2;
				l2 = l2.next;
			} else {
				node.next = l1;
				l1 = l1.next;
			}
			node = node.next;
		}
		if (l1 != null) {
			node.next = l1;
		}
		if (l2 != null) {
			node.next = l2;
		}

		return head.next;

	}
}
