package BinaryTreeHeight;

/**
 * 面试题55 - I. 二叉树的深度
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * 例如：
 *
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1. 左子树是否为空 是 ： 0 ， 否 ： 将左子树作为根 继续判断
 * 2. 根 + 1
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int deep =Math.max(root.left==null?0:maxDepth(root.left),root.right==null?0:maxDepth(root.right)) + 1;
//        System.out.println(deep);
        return deep;
    }
    public static void main(String[] args) {
        int[] data = new int[]{3,9,20,15,7};
        TreeNode root = new TreeNode(data[0]); // 赋值
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.right.left = new TreeNode(data[3]);
        root.right.right = new TreeNode(data[4]);
        Solution solution = new Solution();
        solution.maxDepth(root);
    }
}
