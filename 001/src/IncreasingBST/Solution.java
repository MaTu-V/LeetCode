package IncreasingBST;

/**
 * 897. 递增顺序查找树
 * 给定一个树，按中序遍历重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 * <p>
 * <p>
 * <p>
 * 示例 ：
 * <p>
 * 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
 * <p>
 * 5
 * / \
 * 3    6
 * / \    \
 * 2   4    8
 * /        / \
 * 1        7   9
 * <p>
 * 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 * <p>
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 * \
 * 7
 * \
 * 8
 * \
 * 9
 */
public class Solution {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = new TreeNode(0);
        cur = res;
        newTree(root);
        return res.right;
    }

    public void newTree(TreeNode root){
        if (root == null) return;
        newTree(root.left);
        root.left = null;
        cur.right = root;
        cur = root;
        newTree(root.right);
    }

    public static void main(String[] args) {
        int[] data = new int[]{5, 3, 6, 2, 4, 8, 1, 7, 9};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.right = new TreeNode(data[5]);
        root.left.left.left = new TreeNode(data[6]);
        root.right.right.left = new TreeNode(data[7]);
        root.right.right.right = new TreeNode(data[8]);
        Solution solution = new Solution();
        solution.increasingBST(root);
    }
}
