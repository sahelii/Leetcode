/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                bracket.push(c);
            }

            if (c == ')') {
                if (bracket.empty()) {
                    return false;
                }
                if (bracket.peek() == '(') {
                    bracket.pop();
                } else
                    return false;

            }
            if (c == '}') {
                if (bracket.empty()) {
                    return false;
                }
                if (bracket.peek() == '{') {
                    bracket.pop();
                } else
                    return false;

            }
            if (c == ']') {
                if (bracket.empty()) {
                    return false;
                }
                if (bracket.peek() == '[') {
                    bracket.pop();
                } else
                    return false;

            }

        }
        if (bracket.empty()) {
            return true;
        }
        return false;
    }
}
// @lc code=end
