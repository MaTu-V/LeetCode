package BinaryTreeNum;

/**
 * 938. 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 * <p>
 * 二叉搜索树保证具有唯一的值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 * 示例 2：
 * <p>
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/range-sum-of-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root ==null) return 0;
        if(root.val >=L && root.val<=R){
            return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        }else if(root.val < L){
            return rangeSumBST(root.right,L,R);
        }else{
            return rangeSumBST(root.left,L,R);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{10, 5, 15, 3, 7, 18};
        TreeNode root = new TreeNode(data[0]); // 赋值
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.right = new TreeNode(data[5]);
        Solution solution = new Solution();
        int L = 7;
        int R = 15;
        System.out.println(solution.rangeSumBST(root,L,R));
    }
}
