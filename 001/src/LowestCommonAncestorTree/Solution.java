package LowestCommonAncestorTree;

/**
 * 面试题68 - II. 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 *
 *
 *
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        return (right ==null)?left:(left==null)?right:root;
    }

    public static void main(String[] args) {
        int[] data = new int[]{3,5,1,6,2,0,8,7,4};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.left = new TreeNode(data[5]);
        root.right.right = new TreeNode(data[6]);
        root.left.right.left = new TreeNode(data[7]);
        root.left.right.right = new TreeNode(data[8]);
        Solution solution = new Solution();
        solution.lowestCommonAncestor(root,new TreeNode(data[1]),new TreeNode(data[8]));
    }
}
