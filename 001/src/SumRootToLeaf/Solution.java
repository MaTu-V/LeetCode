package SumRootToLeaf;

/**
 *
 */
public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode root, int num) {
        int val = num*2 + root.val;
        if (root.left == null && root.right == null) {
            return val;
        }else {
            int sum =0;
            if (root.left !=null){
                sum+=dfs(root.left,val);
            }
            if (root.right !=null){
                sum+=dfs(root.right,val);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 0, 1, 0, 1, 0, 1};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.left = new TreeNode(data[3]);
        root.left.right = new TreeNode(data[4]);
        root.right.left = new TreeNode(data[5]);
        root.right.right = new TreeNode(data[6]);
        Solution solution = new Solution();
        solution.sumRootToLeaf(root);
    }
}
