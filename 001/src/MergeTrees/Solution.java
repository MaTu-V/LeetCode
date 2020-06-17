package MergeTrees;

/**
 * 617. 合并二叉树
 *
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-binary-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        TreeNode res = new TreeNode(t1.val + t2.val);
        res.left = mergeTrees(t1.left,t2.left);
        res.right = mergeTrees(t1.right,t2.right);
        return res;
    }
    public static void main(String[] args) {
        int[] data1 = new int[]{1,3,2,5};
        int[] data2 = new int[]{2,1,3,4,7};
        TreeNode t1 = new TreeNode(data1[0]); // 赋值
        TreeNode t2 = new TreeNode(data2[0]);
        t1.left = new TreeNode(data1[1]);
        t1.right = new TreeNode(data1[2]);
        t1.left.left = new TreeNode(data1[3]);
        t2.left = new TreeNode(data2[1]);
        t2.right = new TreeNode(data2[2]);
        t2.left.right = new TreeNode(data2[3]);
        t2.right.right = new TreeNode(data2[4]);
        Solution solution = new Solution();
        TreeNode res = solution.mergeTrees(t1,t2);
        res.prevOrder();
    }
}
