package ShortestToChar;

import java.util.Arrays;

/**
 * 821. 字符的最短距离
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 *
 * 示例 1:
 *
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 */
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        int cur = S.indexOf(C);// 下一个出现C的位置
        int prev = cur; // 前一个C 的位置
        for (int i=0;i<S.length();i++){
            if(S.charAt(i) == C){
                res[i] = 0;
                prev = cur; // 获取当前位置
                cur = S.indexOf(C,i+1); // 重新计算
            }else {
                // 记录
                res[i] = Math.min(Math.abs(prev - i),Math.abs(cur-i));
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        Solution solution = new Solution();
        solution.shortestToChar(S,C);
    }
}
