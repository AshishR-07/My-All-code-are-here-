class Solution {
    public void rev(char[] s , int st , int en){
        if ( st >= en) return ;
        char te = s[st] ;
        s[st] = s[en] ;
        s[en] = te ;
         rev ( s , st+1 , en -1) ;
    }
    public void reverseString(char[] s) {
        
rev (s , 0 , s.length - 1) ;
        }
    }
