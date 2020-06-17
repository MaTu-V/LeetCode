package MaxNumberOfBalloons;

import java.util.Arrays;

/**
 * 1189. “气球” 的最大数量
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * <p>
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：text = "nlaebolko"
 * 输出：1
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：text = "leetcode"
 * 输出：0
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] bucket = new int[26];
        int res = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n')
                bucket[text.charAt(i) - 'a']++;
        }
        int banMinCount = Math.min(Math.min(bucket[0], bucket[1]), bucket['n' - 'a']);
        int loMinCount = Math.min(bucket['l' - 'a'], bucket['o' - 'a']);
        res = Math.min(loMinCount / 2, banMinCount);
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        String text = "balon";
        Solution solution = new Solution();
        solution.maxNumberOfBalloons(text);
    }
}
