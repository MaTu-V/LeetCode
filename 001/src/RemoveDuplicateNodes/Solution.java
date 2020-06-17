package RemoveDuplicateNodes;


import java.util.HashSet;

/**
 * 面试题 02.01. 移除重复节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 * 示例2:
 *
 *  输入：[1, 1, 1, 1, 2]
 *  输出：[1, 2]
 */
public class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode tempHead = new ListNode(-1);
        ListNode tempCur = tempHead;
        ListNode cur = head;
        ListNode next = null;
        while (cur!=null){
            next = cur.next;
            if (!set.contains(cur.val)){
                set.add(cur.val);
                cur.next = null;
                tempCur.next = cur;
                tempCur = tempCur.next;
            }
            cur = next;
        }
        tempHead = tempHead.next;
        //tempHead.printfList(tempHead);
        return tempHead;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,3,2,1};
        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
        Solution solution = new Solution();
        solution.removeDuplicateNodes(head);
    }
}
