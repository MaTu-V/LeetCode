package BinaryMinTree;

/**
 * 面试题 04.02. 最小高度树
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 * <p>
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-height-tree-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1. 数组升序 代表中间结点为根节点
 * 2. 递归左侧 递归右侧 获取中间结点作为左右叶节点
 */
public class Solution {

    public TreeNode sorted(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right)/ 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sorted(nums, left, mid-1);
        root.right = sorted(nums, mid + 1, right);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        Solution solution = new Solution();
        solution.sortedArrayToBST(nums);
    }
}
