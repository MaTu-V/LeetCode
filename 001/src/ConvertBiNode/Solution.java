package ConvertBiNode;

/**
 * 面试题 17.12. BiNode
 * 二叉树数据结构TreeNode可用来表示单向链表（其中left置空，right为下一个链表节点）。实现一个方法，把二叉搜索树转换为单向链表，要求值的顺序保持不变，转换操作应是原址的，也就是在原始的二叉搜索树上直接修改。
 *
 * 返回转换后的单向链表的头节点。
 *
 * 注意：本题相对原题稍作改动
 *
 *
 *
 * 示例：
 *
 * 输入： [4,2,5,1,3,null,6,0]
 * 输出： [0,null,1,null,2,null,3,null,4,null,5,null,6]
 */
public class Solution {
    public TreeNode head = new TreeNode(0);
    public TreeNode convertBiNode(TreeNode root) {
        TreeNode f = head;
        dfs(root);
        return f.right;
    }
    public void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        head.right = root;
        root.left = null;
        head = head.right;
        dfs(root.right);
    }

    public static void main(String[] args) {
        int[] data = new int[]{4,2,5,1,3,6,0};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.left.left.left = new TreeNode(data[5]);
        root.right.right = new TreeNode(data[6]);
        Solution solution = new Solution();
        solution.convertBiNode(root);
    }
}
