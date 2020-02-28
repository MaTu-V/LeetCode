package SignleListAdd;

/**
 * 面试题25. 合并两个排序的链表
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1.创建一个空结点
 * 2. 比较当前两个链表的数据 小的放入
 * 3. 判断两个链表是否有剩余 剩余元素追加如新队列
 * 4. 新链表 头向后移去除空结点
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(true){
            if(l1==null || l2==null){
                break;
            }
            if(l1. val < l2.val){
                // l1 为头
                temp.next = l1;
                l1 =l1.next;
            }else{
                //l2
                temp.next = l2;
                l2 =l2.next;
            }
            temp = temp.next;
        }

        while(l1!=null){
            temp.next = l1;
            l1 =l1.next;
            temp = temp.next;
        }
        while(l2!=null){
            temp.next = l2;
            l2 =l2.next;
            temp = temp.next;
        }
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int[] data1 = new int[]{1,2,4};
        int[] data2 = new int[]{1,3,4};
        ListNode l1 = new ListNode(data1[0]); // 赋值
        ListNode l2 = new ListNode(data2[0]); // 赋值
        for (int i = 1; i < data1.length; i++) {
            l1.add(l1, data1[i]);
        }
        for (int i = 1; i < data2.length; i++) {
            l2.add(l2, data2[i]);
        }
        Solution solution = new Solution();
        solution.mergeTwoLists(l1,l2);
    }
}
