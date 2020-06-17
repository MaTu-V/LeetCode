package BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class Solution {
    public List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        addPath(root,"");
        System.out.println(list);
        return list;
    }
    public void addPath(TreeNode root,String path){
        if (root!=null){
            // 加入
            path +=Integer.toString(root.val); // 字符串苹姐
            if (root.left==null && root.right == null){
                list.add(path);
            }else {
                path+="->";
                addPath(root.left,path);
                addPath(root.right,path);
            }
        }
    }
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,5};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.left.right = new TreeNode(data[3]);
        Solution solution = new Solution();
        solution.binaryTreePaths(root);
    }
}
