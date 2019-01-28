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
	//三指针解决、
	public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode pre = null;
        ListNode newHead = null;
        while(current != null){
            ListNode next = current.next;
            if(next == null){
               newHead = current;
            }
            current.next = pre;
            pre = current;
            current = next;
        }
     	   return newHead;
   	}

	
}
