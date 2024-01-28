class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                answer += " ";
            } else if(ch >= 'A' && ch <= 'Z') {
                answer += (char) ((ch + n > 'Z') ? (ch + n - 26) : (ch + n));
            } else if(ch >= 'a' && ch <= 'z') {
                answer += (char) ((ch + n > 'z') ? (ch + n - 26) : (ch + n));
            }
         }
        return answer;
    }
}