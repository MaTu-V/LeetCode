package MajorityElement;

import java.util.HashMap;

/**
 * 面试题39. 数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 *
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length /2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
                if (map.get(nums[i]) > len){
                    return nums[i];
                }
            }else {
                map.put(nums[i],1);
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        Solution solution =new Solution();
        System.out.println(solution.majorityElement(nums));
    }
}
