package SortArrayByParityII;

import java.util.Arrays;

/**
 * 922. 按奇偶排序数组 II
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *
 */
public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        int idx1=0,idx2 = 1;
        for(int i = 0;i<A.length;i++){
            if(A[i]%2==0){
                res[idx1] = A[i];
                idx1+=2;
            }else{
                res[idx2] = A[i];
                idx2+=2;
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        Solution solution = new Solution();
        solution.sortArrayByParityII(A);
    }
}
