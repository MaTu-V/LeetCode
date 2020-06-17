package RelativeSortArray;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1122. 数组的相对排序
 * 给你两个数组，arr1 和 arr2，
 * <p>
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // 统计数字出现情况
        for (int i = 0; i < arr1.length; i++) {
            if (hashMap.containsKey(arr1[i])) {
                hashMap.put(arr1[i], hashMap.get(arr1[i]) + 1);
            } else {
                hashMap.put(arr1[i], 1);
            }
        }

        int[] res = new int[arr1.length];
        int idx = 0;
        for (int i=0;i<arr2.length;i++){
            if (hashMap.containsKey(arr2[i])){
                //包含该数字
                int len = hashMap.get(arr2[i]);
                while (len-->0){
                    res[idx++] = arr2[i];
                }
                hashMap.remove(arr2[i]);
            }
        }
        int start = idx; //记录排序位置
        for (Integer key:hashMap.keySet()){
            int len = hashMap.get(key);
            while (len-->0){
                res[idx++] = key;
            }
        }
        Arrays.sort(res,start,res.length);// 排序
        System.out.println(Arrays.toString(res));
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2, 1, 4, 3, 9, 6};
        Solution solution = new Solution();
        solution.relativeSortArray(arr1, arr2);
    }
}
