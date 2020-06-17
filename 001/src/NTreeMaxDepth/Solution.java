package NTreeMaxDepth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }else if(root.children.isEmpty()){
            return 1;
        }else{
            List<Integer> list = new LinkedList<>();
            for(Node node:root.children){
                list.add(maxDepth(node));
            }
            return Collections.max(list) + 1;
        }
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
        int height = solution.maxDepth(root);
        System.out.println(height);
    }
}
