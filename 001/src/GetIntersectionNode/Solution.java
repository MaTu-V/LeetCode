package GetIntersectionNode;

/**
 * 面试题 02.07. 链表相交
 * 给定两个（单向）链表，判定它们是否相交并返回交点。请注意相交的定义基于节点的引用，而不是基于节点的值。换句话说，如果一个链表的第k个节点与另一个链表的第j个节点是同一节点（引用完全相同），则这两个链表相交。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Reference of the node with value = 8
 * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 * <p>
 * 示例 2：
 * <p>
 * 输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * 输出：Reference of the node with value = 2
 * 输入解释：相交节点的值为 2 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。
 * <p>
 * 示例 3：
 * <p>
 * 输入：intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * 输出：null
 * 输入解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。由于这两个链表不相交，所以 intersectVal 必须为 0，而 skipA 和 skipB 可以是任意值。
 * 解释：这两个链表不相交，因此返回 null。
 *
 * 警告:
 *  - 此处代码 有问题 数据格式书写错误
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int ALen = 0, BLen = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while (true) {
            ALen++;
            if (curA.next == null) break;
            curA = curA.next;
        }
        while (true) {
            BLen++;
            if (curB.next == null) break;
            curB = curB.next;
        }
        if (ALen >= BLen) {
            // A 长
            // 移动到相同起点
            int len = ALen - BLen;
            while (len-- > 0) {
                headA = headA.next;
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        } else {
            int len = BLen - ALen;
            while (len-- > 0) {
                headB = headB.next;
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
    }

    public static void main(String[] args) {
        int[] dataA = new int[]{4, 1, 8, 4, 5};
        int[] dataB = new int[]{5, 0, 1, 8, 4, 5};
        ListNode headA = new ListNode(dataA[0]); // 赋值
        for (int i = 1; i < dataA.length; i++) {
            headA.add(headA, dataA[i]);
        }
        ListNode headB = new ListNode(dataB[0]); // 赋值
        for (int i = 1; i < dataB.length; i++) {
            headB.add(headB, dataB[i]);
        }
        Solution solution = new Solution();
        ListNode node = solution.getIntersectionNode(headA, headB);
        System.out.println(node.val);
    }
}
