package Sdet;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "(){}[]";
        Solution ss = new Solution();
        ss.isValid(s);

    }
}
