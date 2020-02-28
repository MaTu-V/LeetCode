package ReplaceSpace;

/**
 * 面试题05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 */
public class Solution {
    public String replaceSpace(String s) {
        String str = s.replace(" ","%20");
//        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        Solution solution = new Solution();
        solution.replaceSpace(s);
    }
}
