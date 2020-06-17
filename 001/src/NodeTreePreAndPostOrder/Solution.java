package NodeTreePreAndPostOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * <p>
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class Solution {
    List<Integer> res = new LinkedList<>();

    /**
     * 前序遍历
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return res;
        }
        res.add(root.val);
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                preorder(root.children.get(i));
            }
        }
        return res;
    }

    /**
     * 后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return res;
        }
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                postorder(root.children.get(i));
            }
        }
        res.add(root.val);
        return res;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 3, 2, 4, 5, 6};
        List<Node> root_c = new ArrayList<>();
        List<Node> c_c = new ArrayList<>();
        Node node_1_1 = new Node(data[4]);
        Node node_1_2 = new Node(data[5]);
        c_c.add(node_1_1);
        c_c.add(node_1_2);
        Node node_1 = new Node(data[1], c_c);
        Node node_2 = new Node(data[2]);
        Node node_3 = new Node(data[3]);
        root_c.add(node_1);
        root_c.add(node_2);
        root_c.add(node_3);
        Node root = new Node(data[0], root_c);
        Solution solution = new Solution();
        solution.preorder(root);
        solution.postorder(root);
    }
}
