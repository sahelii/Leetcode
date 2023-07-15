/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
    char[] ans = String.valueOf(num).toCharArray();

    for (int i = 0; i < ans.length; ++i)
      if (ans[i] == '6') {
        ans[i] = '9';
        break;
      }

    return Integer.valueOf(String.valueOf(ans));
  }
}