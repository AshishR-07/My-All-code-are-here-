import java.util.* ;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n = nums.length ; 
       int [] ans = new int [n] ;
       
       Arrays.fill(ans , -1) ;
       Stack <Integer> st = new Stack <>() ; 

       for ( int i = 0 ; i<2*n ; i++){
        int currentValue = nums[i% n] ;
        while (!st.isEmpty() && currentValue > nums[st.peek()]){
            ans[st.peek() ] = currentValue ;
            st.pop() ;
        }if ( i<n)
        st.push(i) ;
       }
       return ans ;
    }
}