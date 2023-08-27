/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;

        for(int i : nums) {
            if(i!= val) {
                nums[c++] = i;
            }
           
        }
         return c;
    }
}
// @lc code=end

