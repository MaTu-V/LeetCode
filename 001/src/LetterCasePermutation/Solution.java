package LetterCasePermutation;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 * <p>
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 * <p>
 * 输入: S = "12345"
 * 输出: ["12345"]
 */
public class Solution {
    public List<String> list = new ArrayList<>();

    public List<String> letterCasePermutation(String S) {
        letterCasePermutation(S, 0);
        System.out.println(list);
        return list;
    }

    public void letterCasePermutation(String S, int start) {
        list.add(S);
        for (int i = start; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                String str = S.substring(0, i) + ((char) (ch - 32)) + S.substring(i + 1);
                letterCasePermutation(str, i + 1);
            } else if (ch >= 'A' && ch <= 'Z') {
                String str = S.substring(0, i) + ((char) (ch + 32)) + S.substring(i + 1);
                letterCasePermutation(str, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.letterCasePermutation("a1b2");
    }
}
