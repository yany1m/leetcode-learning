//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9767 👎 0


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 哈希表记录，时间复杂度o(n),空间复杂度o(n)
 * @author Yim
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>(length - 1);
        map.put(nums[0], 0);
        for (int i = 1; i < length; i++) {
            Integer key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
