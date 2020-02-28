package SignleListRevrse;

/**
 * 面试题24. 反转链表
 *
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 *  
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1. 创建一个空结点（代表新链表的头）
 * 2. 获取当前第一个结点 cur
 * 3. 判断 当前结点是否存在
 * 4. 流程
 *     1 ->  2 -> 3
 *     保存 2 到  next
 *
 *     -1 -> null 初始
 *     1 -> null 当前的下一个 指向 新链表的下一个
 *     -1 -> 1 新链表的下个在指向当前的头（环）
 *
 *  5. 新链表 向下移 去除空结点
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head ==null || head.next == null){
            return head; // 返回当前 仅有一个结点
        }
        ListNode cur = head; // 指向当前
        ListNode next = null; // 指向当前的下一个
        ListNode reverseHead = new ListNode(-1);//获取一个空结点
        reverseHead.next = null;// 空链表当前含有一个
        while(cur!=null){
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        reverseHead = reverseHead.next;
        return reverseHead;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
        Solution solution = new Solution();
        solution.reverseList(head);
    }
}
