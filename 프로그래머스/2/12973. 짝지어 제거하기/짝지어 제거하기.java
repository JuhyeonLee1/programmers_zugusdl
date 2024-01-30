import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                // stack 내부에 요소가 있거나, 같은 알파벳이 붙어있으면 stack에서 꺼내기
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        answer = stack.isEmpty() ? 1 : 0;
        return answer;
    }
}