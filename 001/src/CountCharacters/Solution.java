package CountCharacters;

import java.util.Arrays;

/**
 * 1160. 拼写单词
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 * <p>
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * <p>
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 * <p>
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCo = new int[26];
        int res = 0;
        for (int i = 0; i < chars.length(); i++) {
            charCo[chars.charAt(i) - 'a']++;
        }
        for (int i = 0; i < words.length; i++) { // 当前单词
            int[] word = new int[26];
            boolean flag = true;//掌握
            for (int j = 0; j < words[i].length(); j++) { //统计出现次数
                word[words[i].charAt(j) - 'a']++;
            }

            for (int k = 0; k < charCo.length; k++) {
                if (charCo[k] < word[k]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += words[i].length();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = new String[]{
                "cat", "bt", "hat", "tree"
        };
        String chars = "atach";
        Solution solution = new Solution();
        solution.countCharacters(words, chars);
    }
}
