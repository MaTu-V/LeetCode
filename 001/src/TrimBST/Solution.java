package TrimBST;

/**
 * 669. 修剪二叉搜索树
 * 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
 *
 * 示例 1:
 *
 * 输入:
 *     1
 *    / \
 *   0   2
 *
 *   L = 1
 *   R = 2
 *
 * 输出:
 *     1
 *       \
 *        2
 * 示例 2:
 *
 * 输入:
 *     3
 *    / \
 *   0   4
 *    \
 *     2
 *    /
 *   1
 *
 *   L = 1
 *   R = 3
 *
 * 输出:
 *       3
 *      /
 *    2
 *   /
 *  1
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null){
            return null;
        }
        if (root.val < L){ // 右侧
            return  trimBST(root.right,L,R);
        }
        if (R < root.val){ // 左侧
            return  trimBST(root.left,L,R);
        }

        // 中间
        root.left = trimBST(root.left,L,R);
        root.right = trimBST(root.right,L,R);
        return  root;
    }
    public static void main(String[] args) {
        int[] data = new int[]{3,0,4,2,1};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.right = new TreeNode(data[3]);
        root.left.right.left = new TreeNode(data[4]);
        int L = 1;
        int R = 3;
        Solution solution = new Solution();
        solution.trimBST(root,L,R);
    }
}
