package BinaryLinkedListToInteger;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    void add(ListNode head,int val){
        ListNode temp = head;
        while (true){
            if (temp.next == null)
                break;
            temp = temp.next;
        }
        // 挂在末尾
        temp.next = new ListNode(val);
    }

    void printfList(ListNode head){
        if (head == null){
            System.out.println("单链表为空!");
        }
        ListNode temp = head;
        while (true){
            System.out.print(temp.val + "\t");
            if (temp.next == null)
                break;
            temp = temp.next;
        }
    }
}
