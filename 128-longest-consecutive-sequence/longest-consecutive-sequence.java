import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longchain = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currchain = 1;
                while (set.contains(num + currchain)) {
                    currchain += 1;
                }
                
                longchain = Math.max(longchain, currchain);
            }
        }
        return longchain;
    }
}
