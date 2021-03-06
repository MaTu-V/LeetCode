package ConvertBST;

/**
 *538. 把二叉搜索树转换为累加树
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 *
 *
 * 例如：
 *
 * 输入: 原始二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 */
public class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root!=null){
            convertBST(root.right);
            root.val += sum;
            sum = root.val;
            convertBST(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] data = new int[]{5,2,13};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        Solution solution = new Solution();
        solution.convertBST(root);
        root.prevOrder();
    }
}
