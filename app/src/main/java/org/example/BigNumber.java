package org.example;

import java.util.Stack;

public class BigNumber {

    public static void main(String[] args) {
        System.out.println("a");
        System.out.println(new BigNumber().solution("4177252841", 4));
    }
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int digit = number.length() - k;
        
        for (int i = 0; i < number.length(); i++) {
            char intAt = number.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() < intAt) {
                stack.pop();
                k--;
            }
            stack.push(intAt);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().substring(0, digit);
    }
}
