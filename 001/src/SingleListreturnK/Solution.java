package SingleListreturnK;
class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(true){
            len++;
            if(temp.next==null)
                break;
            temp =temp.next;
        }
        ListNode endTemp = head;
        for(int i=0;i<len - k;i++){
            endTemp = endTemp.next;
        }
        System.out.println(endTemp.val);
        return endTemp.val;
    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(data[0]); // 赋值
        for (int i = 1; i < data.length; i++) {
            head.add(head, data[i]);
        }
        Solution solution = new Solution();
        solution.kthToLast(head,2);
    }
}
