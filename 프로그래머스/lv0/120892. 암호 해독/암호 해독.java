class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i = 1;
        while(code*i - 1 < cipher.length()){
            answer += cipher.charAt(code*i - 1);
            i++;
        }
        return answer;
    }
}