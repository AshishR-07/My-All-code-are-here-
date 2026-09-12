class Solution {
    public boolean isPalindrome(int n) {
        int original =n;
        int rev = 0;

        while(n > 0) {
            int digit = n % 10;   // last digit
            rev = rev * 10 + digit;
            n = n / 10;
        }
        
            return rev == original ? true : false ;
    }
}