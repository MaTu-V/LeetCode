package IsUnivalTree;

/**
 * 965. 单值二叉树
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 * <p>
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：[2,2,2,5,2]
 * 输出：false
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEq(root, root.val);
    }

    public boolean isEq(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != val) {
            return false;
        }
        if (root.right != null && root.right.val != val) {
            return false;
        }
        return isEq(root.left, val) && isEq(root.right, val);
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 1, 1, 1, 1, 1};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.right = new TreeNode(data[5]);
        Solution solution = new Solution();
        solution.isUnivalTree(root);
    }
}
