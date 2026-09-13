class Solution {
    public int trap(int[] height) {

        int n = height.length;

        // Prefix maximum
        int[] prefix = new int[n];
        prefix[0] = height[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i]);
        }

        // Suffix maximum
        int[] suffix = new int[n];
        suffix[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], height[i]);
        }

        // Calculate trapped water
        int water = 0;

        for (int i = 0; i < n; i++) {

            int waterLevel = Math.min(prefix[i], suffix[i]);

            water += waterLevel - height[i] ;
        }

        return water;
    }
}