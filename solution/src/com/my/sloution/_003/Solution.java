package com.my.sloution._001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        ////元素值和元素位置的映射
        Map<Integer,Integer> map = new HashMap<>(16);
        //遍历数组 把数组索引作为key,值为value 存入 map,
        for (int i = 0; i < nums.length ; i++) {
           int one = nums[i];
           int matchedNum = target-one;
           //map中命中
           if (map.containsKey(matchedNum) ){
               //拿到索引
               indexes[0] = map.get(matchedNum);
               indexes[1] = i;
               return indexes;
           }else {
               map.put(nums[i],i);
           }
        }
        return indexes;
        //暴力法
//        for (int i = 0; i < nums.length; i++) {
//            int one = nums[i];
//            for (int j = nums.length-1; j > i; j--) {
//                if (nums[j] == target - one) {
//                    indexes[0] = i;
//                    indexes[1] = j;
//                    return indexes;
//                }
//
//            }
//        }
//        return indexes;

    }

    public static void main(String[] args) {
        int[] nums= new int[]{2,11,7,15};
        int target= 9;
        Solution instance = new Solution();
        System.out.println(Arrays.toString(instance.twoSum(nums, target)));
    }
}