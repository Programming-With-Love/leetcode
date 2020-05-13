import java.util.LinkedList;

/**
 * @author tujietg
 * @date 5/13/20 9:48 AM
 */
public class No155 {

    LinkedList<Integer> list = null;
    LinkedList<Integer> minList = null;

    /**
     * initialize your data structure here.
     */
    public No155() {
        list = new LinkedList();
        minList = new LinkedList();

    }

    public void push(int x) {
        list.addFirst(x);
        if (minList.size() == 0 || minList.element() >= x) {
            minList.addFirst(x);
        }
    }

    public void pop() {
        if (minList.get(0).equals(list.element())) {
            minList.poll();
        }
        list.poll();
    }

    public int top() {
        return list.element();

    }

    public int getMin() {
        return minList.get(0);
    }


}
