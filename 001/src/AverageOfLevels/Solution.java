package AverageOfLevels;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 637. 二叉树的层平均值
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 *
 * 示例 1:
 *
 * 输入:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出: [3, 14.5, 11]
 * 解释:
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 */
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            double sum = 0;
            for (int i=0;i<len;i++){
                TreeNode temp =queue.poll();
                sum+=temp.val;
                if (temp.left!=null){
                    queue.add(temp.left);
                }
                if (temp.right!=null){
                    queue.add(temp.right);
                }
            }
            list.add(sum/len);
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        int[] data = new int[]{3, 9,20,15,7};
        TreeNode root = new TreeNode(data[0]);
        root.left = new TreeNode(data[1]);
        root.right = new TreeNode(data[2]);
        root.right.left = new TreeNode(data[3]);
        root.right.right = new TreeNode(data[4]);
        Solution solution = new Solution();
        solution.averageOfLevels(root);
    }
}
