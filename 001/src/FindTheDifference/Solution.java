package FindTheDifference;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *
 *
 * 示例:
 *
 * 输入：
 * s = "abcd"
 * t = "abcde"
 *
 * 输出：
 * e
 *
 * 解释：
 * 'e' 是那个被添加的字母。
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        int[] co = new int[26];
        for (int i =0;i<s.length();i++){
            co[s.charAt(i) - 'a']++;
        }
        char res = ' ';
        for (int i = 0;i<t.length();i++){
            if(co[t.charAt(i) -'a'] == 0){
                return t.charAt(i);
            }else {
                co[t.charAt(i) -'a']--;
            }
        }
        for (int i =0;i<co.length;i++){
            if (co[i] != 0){
                return  (char) ('a' + i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String S = "a";
        String T = "aa";

        Solution solution = new Solution();
        System.out.println(solution.findTheDifference(S,T));
    }
}
