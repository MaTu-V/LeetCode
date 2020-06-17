package isSubPath;

public class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) {
            // 找到
            return true;
        }
        if (root.val == head.val) {
            head = head.next;
        }

        if (root.left != null && isSubPath(head, root.left)) {
            return true;
        } else if (root.right != null && isSubPath(head, root.right)) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        int[] data = new int[]{4, 2, 8};
        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
        int[] treeData = new int[]{1, 4, 4, 2, 2, 1, 6, 8, 1, 3};
        TreeNode root = new TreeNode(treeData[0]); // 赋值
        root.left = new TreeNode(treeData[1]);
        root.right = new TreeNode(treeData[2]);
        root.left.right = new TreeNode(treeData[3]);
        root.right.left = new TreeNode(treeData[4]);
        root.left.right.left = new TreeNode(treeData[5]);
        root.right.left.left = new TreeNode(treeData[6]);
        root.right.left.right = new TreeNode(treeData[7]);
        root.right.left.right.left = new TreeNode(treeData[8]);
        root.right.left.right.left = new TreeNode(treeData[9]);
        Solution solution = new Solution();
        System.out.println(solution.isSubPath(head, root));
    }
}
