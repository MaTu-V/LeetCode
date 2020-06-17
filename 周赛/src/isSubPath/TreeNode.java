package isSubPath;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    /**
     * 左序遍历
     */
    void prevOrder(){
        System.out.print(this.val + "\t");
        if (this.left !=null){
            this.left.prevOrder();
        }
        if (this.right!=null){
            this.right.prevOrder();
        }
    }
}
