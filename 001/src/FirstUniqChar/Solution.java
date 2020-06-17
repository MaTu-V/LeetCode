package FirstUniqChar;

/**
 * 面试题50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 *
 */
public class Solution {
    public char firstUniqChar(String s) {
        int[] res = new int[26];
        for (int i =0;i<s.length();i++){
            res[s.charAt(i) - 'a']++;
        }
        for (int i =0;i<s.length();i++){
            if (res[s.charAt(i) -'a'] == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String S =  "abaccdeff";
        Solution solution = new Solution();
        solution.firstUniqChar(S);
    }
}
