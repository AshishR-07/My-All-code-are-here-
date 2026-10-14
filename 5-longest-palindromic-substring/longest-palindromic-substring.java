class Solution {
    public String longestPalindrome(String s) {
       int maxlen = 0 ;
       int currlen = 0 ;
       int start = 0 ;
       for ( int i= 0 ; i<s.length() ; i++ ){
        int left = i ; int right = i ;
        while (left>= 0  && right  < s.length() && s.charAt(left) == s.charAt(right)){
            currlen = right - left + 1 ;
            if ( currlen > maxlen){
                maxlen = currlen ;
                start = left ;
            }
            left-- ; right++ ;
        }
         left = i ;
         right = i+1 ;
        while (left>= 0  && right < s.length() && s.charAt(left) == s.charAt(right )){
             currlen = right - left + 1 ;
            if ( currlen > maxlen){
                maxlen = currlen ;
                start = left ;
            }
            left-- ; 
            right++ ;
        }
       }
       return s.substring(start , maxlen + start) ;
    }
}