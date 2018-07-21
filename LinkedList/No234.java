package LinkedList;

//回文链表1->2->2->1
public class No234 {
	boolean a = true;
	ListNode hd;

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		hd = head;
		ListNode end = head;
		demo(end);
		return a;
	}

	public void demo(ListNode end) {
		if (end.next == null) {
			return;
		}
		end = end.next;
		demo(end);
		if (hd.val == end.val) {
			hd = hd.next;
			a = a & true;
		} else {
			a = a & false;
		}
	}

}
