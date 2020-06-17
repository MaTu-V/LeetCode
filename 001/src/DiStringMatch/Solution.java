package DiStringMatch;

import java.util.Arrays;

/**
 * 942. 增减字符串匹配
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * <p>
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * <p>
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int[] diStringMatch(String S) {
        S +=" ";
        int len = S.length();
        int[] res = new int[len];
        int start = 0;
        int end = len - 1;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == 'I') {
                res[i] = start++;
            } else {
                res[i] = end--;
            }
        }
        //System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.diStringMatch("DDI");
    }
}
