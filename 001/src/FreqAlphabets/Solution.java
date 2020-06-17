package FreqAlphabets;

import java.util.Arrays;
import java.util.Stack;

/**
 * 1309. 解码字母到整数映射
 * <p>
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 * <p>
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
 * 返回映射之后形成的新字符串。
 * <p>
 * 题目数据保证映射始终唯一。
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public String freqAlphabets(String s) {
        char[] ch = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            if (i + 2 < ch.length && ch[i + 2] == '#') {
                builder.append((char) ((ch[i] -'0') * 10 + (ch[i + 1] - '1') + 'a'));
                i += 2;
            }else {
                builder.append((char) ((ch[i] -'1') +  'a'));
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.freqAlphabets("10#11#12");
    }
}
