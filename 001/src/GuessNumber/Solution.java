package GuessNumber;

/**
 * LCP 1.猜数字
 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/guess-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 * 1.三人可不用循环 三元表达式求解加和即可
 */
public class Solution {
    public int game(int[] guess, int[] answer) {
        int count = 0; // 统计数字
        for (int i = 0; i < answer.length; i++) {
           if (guess[i] == answer[i]){
               count++;
           }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
