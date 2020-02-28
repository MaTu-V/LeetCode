package BinaryTreeImage;

/**
 * 面试题27. 二叉树的镜像
 * <p>
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * <p>
 * 例如输入：
 * <p>
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 * <p>
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * <p>
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 思路：
 * 交换swap
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode temp = root.left;// 保存左侧
        root.left = mirrorTree(root.right);//返回右侧结点 赋值给左侧
        root.right = mirrorTree(temp);// 将左侧 交给右侧
        return root;
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 2, 7, 1, 3, 6, 9};
        TreeNode root = new TreeNode(data[0]); // 赋值
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.left = new TreeNode(data[5]);
        root.right.right = new TreeNode(data[6]);
        Solution solution = new Solution();
        solution.mirrorTree(root);
        root.prevOrder();
    }
}
