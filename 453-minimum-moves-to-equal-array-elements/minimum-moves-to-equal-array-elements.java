class Solution {
    public int minMoves(int[] nums) {
        long count = 0 ;
        int sum = 0 ;
       int min = nums[0] ;
       for ( int i = 0 ; i<nums.length ; i++){
        sum += nums[i] ;
    if ( nums[i]  < min)
    min = nums[i] ;}

       return (int)( sum -(long) nums.length * min ) ;
    }
}