package smallerNumbersThanCurrent;

import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[j]!=nums[i] && nums[j]<nums[i]){
                    res[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6,3,7,6,9};
        Solution solution = new Solution();
        solution.smallerNumbersThanCurrent(nums);
    }
}
