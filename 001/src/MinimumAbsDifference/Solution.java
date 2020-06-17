package MinimumAbsDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1200. 最小绝对差
 * 给你个整数数组 arr，其中每个元素都 不相同。
 *
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 *
 *
 *
 * 示例 1：
 *
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 *
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * 示例 3：
 *
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 *
 */
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int[] res = new int[arr.length -1 ];
        for (int i =0;i<arr.length -1;i++){
            res[i] = arr[i + 1] - arr[i];
        }
        int min = res[0];
        for (int i =0;i<res.length;i++){
            if(res[i] <min) min = res[i];
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i =0;i<res.length;i++){
            List<Integer> list = new ArrayList<>();
            if(res[i] == min){
                list.add(arr[i]);
                list.add(arr[i+1]);
            }
            if (!list.isEmpty()){
                lists.add(list);
            }
        }
        System.out.println(lists);
        return lists;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,-10,23,19,-4,-14,27};
        Solution solution = new Solution();
        solution.minimumAbsDifference(arr);
    }
}
