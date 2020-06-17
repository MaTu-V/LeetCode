package UniqueOccurrences;

import java.util.HashSet;

/**
 * 1207. 独一无二的出现次数
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * <p>
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 解释：在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。
 * 示例 2：
 * <p>
 * 输入：arr = [1,2]
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * 输出：true
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] bucket = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] + 1000]++;
        }
        HashSet<Integer> set = new HashSet<>();
        boolean flag = true;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != 0){
                if(set.contains(bucket[i])){
                    flag = false;
                    break;
                }else {
                    set.add(bucket[i]);
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1,1,3};
        Solution solution = new Solution();

        System.out.println(solution.uniqueOccurrences(arr));
    }
}
