import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (j < nums.length) {
            int rightNum = nums[j];
            map.put(rightNum, map.getOrDefault(rightNum, 0) + 1);
            while (map.get(rightNum) > k) {
                int leftNum = nums[i];
                map.put(leftNum, map.get(leftNum) - 1);
                i++;
            }

            result = Math.max(result, j - i + 1);
            j++;
        }
        
        return result;
    }
}
