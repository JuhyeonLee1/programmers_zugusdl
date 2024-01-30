import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                // stack 객체가 비어있지 않고,
                // 마지막에 넣은 char와 이제 넣을 char가 같으면 stack에서 꺼내기
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}