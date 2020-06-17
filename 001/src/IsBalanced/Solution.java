package IsBalanced;

/**
 * 面试题 04.04. 检查平衡性
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 *
 *
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *       1
 *      / \
 *     2   2
 *    / \
 *   3   3
 *  / \
 * 4   4
 * 返回 false 。
 */
public class Solution {
    public int dfs(TreeNode node,int height){
        if(node == null){
            return height ;
        }
        return Math.max(dfs(node.left,height+1),dfs(node.right,height+1));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int leftH = dfs(root.left,1);
        int rightH = dfs(root.right,1);
        if(Math.abs(leftH - rightH) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        int[] data = new int[]{3,9,20,15,7};
        TreeNode root = new TreeNode(data[0]); // 赋值
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.right.left = new TreeNode(data[3]);
        root.right.right = new TreeNode(data[4]);
        Solution solution = new Solution();
        solution.isBalanced(root);
    }
}
