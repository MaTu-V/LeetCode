package BinaryLinkedListToInteger;

/**
 * 1290. 二进制链表转整数
 * <p>
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * <p>
 * 请你返回该链表所表示数字的 十进制值 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int result = 0;
        while (temp!=null){
            result *= 2;
            result += temp.val;
            temp = temp.next;
        }
//        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};

        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
//        head.printfList(head);
        Solution solution = new Solution();
        solution.getDecimalValue(head);
    }
}
