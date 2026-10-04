class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0 ;
        int prev = 0 ;
        int curr= 0 ;
        for ( int i = 0 ; i<nums.length ; i++){
            if ( nums[i]==1) 
            curr++ ;
            else {
                ans = Math.max(ans , prev+curr);
                prev= curr ;
                curr=0 ;
            }
        }
       
        ans=Math.max(ans,prev+curr);
       if (ans == nums.length) {
           return ans - 1;
        } else {
           return ans;
        }
    }
}