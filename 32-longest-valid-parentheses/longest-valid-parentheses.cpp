#include <algorithm>
#include <string>

using namespace std;

class Solution {
public:
    int longestValidParentheses(string s) {
        int left = 0, right = 0, maxLen = 0;

        // Pass 1: Left-to-right scan
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                maxLen = max(maxLen, 2 * right);
            } else if (right > left) {
                left = 0;
                right = 0;
            }
        }

        left = 0;
        right = 0;

        // Pass 2: Right-to-left scan
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s[i] == '(') {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                maxLen = max(maxLen, 2 * left);
            } else if (left > right) {
                left = 0;
                right = 0;
            }
        }

        return maxLen;
    }
};
