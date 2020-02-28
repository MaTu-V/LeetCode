package SignleListprintfEndIndx;

/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * 思路：
 * 1. 求出长度
 * 2. 遍历单链表 将 第 i个 放在 length -1 位置上
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        if(head==null){
            return (new int[0]);
        }
        int len =0;
        ListNode temp = head;
        while(true){
            len++;
            if(temp.next==null){
                break;
            }
            temp = temp.next;
        }
        int[] res = new int[len];
        int idx=len-1;
        while(true){
            res[idx--] = head.val;
            if(head.next==null){
                break;
            }
            head = head.next;
        }
//        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        int[] data = new int[]{1,3,2};
        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
        Solution solution = new Solution();
        solution.reversePrint(head);
    }
}
