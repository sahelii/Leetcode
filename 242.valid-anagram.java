/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String s2 = new String(arr2);

        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }
}

// @lc code=end
