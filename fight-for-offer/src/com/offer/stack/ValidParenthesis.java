package com.offer.stack;

import java.util.Stack;

/**
 * @author wuyanfeng
 * @description
 * @date 2021/3/3 9:55
 */
public class ValidParenthesis {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack stack = new Stack<Character>();
        for (Character mark : chars) {
            if (mark == '(') {
                stack.push(')');
            } else if (mark == '[') {
                stack.push(']');
            } else if (mark == '{') {
                stack.push('}');
            } else if (stack.empty() || stack.pop() != mark) {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        isValid("()[]{}");
    }
}
