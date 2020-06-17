package TitleToNumber;

/**
 * 171. Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 * <p>
 * 例如，
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * 示例 1:
 * <p>
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: "AB"
 * 输出: 28
 */
public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int temp = 0;
        for (int i = 0; i < s.length();i++) {
            temp = s.charAt(i) -'A' + 1;
            res = res*26 + temp;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.titleToNumber("AAB");
    }
}
