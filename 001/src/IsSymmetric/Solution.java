package IsSymmetric;

/**
 * 面试题28. 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isF(root.left,root.right);
    }

    boolean isF(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return isF(L.left, R.right) && isF(L.right, R.left); // 左右 右左
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,2,3,4,4,3 };
        TreeNode root = new TreeNode(data[0]); // 赋值
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.left = new TreeNode(data[5]);
        root.right.right = new TreeNode(data[6]);
        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(root));
    }
}
