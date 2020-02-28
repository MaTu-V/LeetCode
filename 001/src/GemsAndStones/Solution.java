package GemsAndStones;


/**
 * 771. 宝石与石头
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jewels-and-stones
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路：
 *  1.牺牲空间换时间
 *  2.桶排序思想
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {
        byte[] c = new byte[58];
        int count = 0;
        for (char ch : J.toCharArray()) {
            c[ch - 65] = 1;
        }
        for (char ch : S.toCharArray()) {
            if(c[ch - 65] == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        Solution solution = new Solution();
        solution.numJewelsInStones(J, S);
    }
}
