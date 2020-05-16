package LinkedList;

/**
 * 第一次 刷困难 贼开心
 *
 * @author tujietg
 * @date 5/16/20 11:37 AM
 */
public class No25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        //虚拟一个节点 指向头部
        ListNode pre = new ListNode(Integer.MIN_VALUE);
        pre.next = head;

        ListNode tail = pre;
        ListNode start, next;
        ListNode hire = pre;

        while (pre.next != null) {
            // 将tail 移到小段的末尾
            for (int i = 0; i < k && tail != null; i++) {
                tail = tail.next;
            }
            if (tail == null) {
                break;
            }
            start = pre.next;

            next = tail.next;
            tail.next = null;

            pre.next = reverseList(start);
            start.next = next;

            pre = start;
            tail = pre;
        }
        return hire.next;

    }


    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }


}
