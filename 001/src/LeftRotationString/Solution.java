package LeftRotationString;

/**
 * 面试题58 - II. 左旋转字符串
 *
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 思路：
 *  1.字符串按位截取
 *  2.拼接
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() < n) {
            return "";
        }
        String str1 = s.substring(0, n);
        String str2 = s.substring(n + 1);
        return str2 + str1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseLeftWords("abcdefg", 2);
        solution.reverseLeftWords("lrloseumgh", 6);
    }
}
