class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 1) {
            int c = (s.length() / 2);
            answer += s.charAt(c);
        } else {
            int c = s.length() / 2;
            answer += s.charAt(c-1);
            answer += s.charAt(c);
        }
        return answer;
    }
}