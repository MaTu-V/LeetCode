package AddDigits;

/**
 * 258. 各位相加
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 */
public class Solution {
    public int addDigits(int num) {
        String res = num + "";
        if(res.length() == 1 ){
            return num;
        }else{
            int r = 0;
            for(int i =0;i<res.length();i++){
                r+=Integer.parseInt(String.valueOf(res.charAt(i)));
            }
            return addDigits(r);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addDigits(38);
    }
}
