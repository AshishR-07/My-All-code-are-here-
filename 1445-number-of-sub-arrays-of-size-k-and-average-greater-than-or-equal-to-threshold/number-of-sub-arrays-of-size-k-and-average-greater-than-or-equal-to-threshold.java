class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
         int c= 0 ;
         int sum = 0 ;
        for ( int i = 0 ; i<k ; i++){
            sum += arr[i] ;
        }
            for ( int j = k ; j<arr.length ; j++){ 
                if (sum /k >= threshold) c++ ;
                 sum -= arr[j-k] ;
                sum += arr[j] ;
               
            }
             if (sum /k >= threshold) c++ ;
         return c ;
    }
}