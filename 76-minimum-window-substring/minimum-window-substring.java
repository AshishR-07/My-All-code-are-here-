class Solution {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        for (char c : t.toCharArray()) {
            hash[c]++;}
        int left = 0;  int count = 0;
        int minLen = Integer.MAX_VALUE; int startIndex = -1;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (hash[c] > 0) {
                count++;}
            hash[c]--;
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                hash[leftChar]++;
                if (hash[leftChar] > 0) {
                    count--;}
                  left++;
            }
        }
        if (startIndex == -1) return "";
        return s.substring(startIndex, startIndex + minLen);
    }
}