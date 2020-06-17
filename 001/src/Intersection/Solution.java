package Intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for (int i = 0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        set2.retainAll(set1);
        int[] res = new int[set2.size()];
        int k =0;
        for (Integer setData:set2){
            res[k++] = setData;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public static void main(String[] args) {
       int[] nums1 = new int[]{1,2,2,1};
       int[] nums2 = new  int[]{2,2};
       Solution solution = new Solution();
       solution.intersection(nums1,nums2);
    }
}
