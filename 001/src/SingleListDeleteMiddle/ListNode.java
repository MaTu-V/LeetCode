package SingleListDeleteMiddle;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    void add(ListNode head, int val) {
        ListNode temp = head;
        while (true) {
            if (temp.next == null)
                break;
            temp = temp.next;
        }
        // 挂在末尾
        temp.next = new ListNode(val);
    }

    ListNode get(ListNode head, int val) {
        if (head == null) {
            System.out.println("单链表为空!");
        }
        ListNode temp = head;
        while (true) {
            if (temp != null && temp.val == val) {
                break;
            }
            if (temp.next == null) {
                temp = null;
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    void printfList(ListNode head) {
        if (head == null) {
            System.out.println("单链表为空!");
        }
        ListNode temp = head;
        while (true) {
            System.out.print(temp.val + "\t");
            if (temp.next == null)
                break;
            temp = temp.next;
        }
    }
}
