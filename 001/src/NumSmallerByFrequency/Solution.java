package NumSmallerByFrequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * 1170. 比较字符串最小字母出现频次
 * 我们来定义一个函数 f(s)，其中传入参数 s 是一个非空字符串；该函数的功能是统计 s  中（按字典序比较）最小字母的出现频次。
 * <p>
 * 例如，若 s = "dcce"，那么 f(s) = 2，因为最小的字母是 "c"，它出现了 2 次。
 * <p>
 * 现在，给你两个字符串数组待查表 queries 和词汇表 words，请你返回一个整数数组 answer 作为答案，其中每个 answer[i] 是满足 f(queries[i]) < f(W) 的词的数目，W 是词汇表 words 中的词。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：queries = ["cbd"], words = ["zaaaz"]
 * 输出：[1]
 * 解释：查询 f("cbd") = 1，而 f("zaaaz") = 3 所以 f("cbd") < f("zaaaz")。
 * 示例 2：
 * <p>
 * 输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
 * 输出：[1,2]
 * 解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。
 */
public class Solution {
    public int minCount(String str) {
        int[] word = new int[26];
        for (int i = 0; i < str.length(); i++) {
            word[str.charAt(i) - 'a']++;
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < word.length; i++) {
            if (word[i] != 0 && word[i] < min) {
                min = word[i];
                break;
            }
        }
        return min;
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] quire = new int[queries.length];
        int[] word = new int[words.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            quire[i] = minCount(queries[i]);
        }
        for (int i = 0; i < words.length; i++) {
            word[i] = minCount(words[i]);
        }
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < word.length; j++) {
                if (quire[i] < word[j]) {
                    count++;
                }
            }
            list.add(count);
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for (Integer i:list){
            answer[idx++]=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] queries = new String[]{"bbb", "cc"};
        String[] words = new String[]{"a", "aa", "aaa", "aaaa"};
        Solution solution = new Solution();
        solution.numSmallerByFrequency(queries, words);
    }

}
