package SingleListDeleteMiddle;

/**
 * 面试题 02.03. 删除中间节点
 * 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 *
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
        Solution solution = new Solution();
        solution.deleteNode(head.get(head,4));
        head.printfList(head);
    }
}
