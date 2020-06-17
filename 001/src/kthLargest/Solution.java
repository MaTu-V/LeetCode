package kthLargest;

import java.util.ArrayList;

public class Solution {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root, list);
        System.out.println(list.get(k - 1));
        return list.get(k - 1);
    }

    public void postOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            postOrder(root.right, list);
        }
        list.add(root.val);
        if (root.left != null) {
            postOrder(root.left, list);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 4, 2};
        TreeNode root = new TreeNode(nums[0]);
        root.left = new TreeNode(nums[1]);
        root.right = new TreeNode(nums[2]);
        root.left.right = new TreeNode(nums[3]);
        Solution solution = new Solution();
        solution.kthLargest(root,1);
    }
}
