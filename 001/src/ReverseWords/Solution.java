package ReverseWords;

/**
 * 557. 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class Solution {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] strs = s.split(" ");
        for (int i = 0;i<strs.length;i++){
            builder.append(new StringBuilder(strs[i]).reverse() + " ");
        }
        System.out.println(builder.toString());
        return  builder.toString().trim();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseWords("Let's take LeetCode contest");
    }
}
