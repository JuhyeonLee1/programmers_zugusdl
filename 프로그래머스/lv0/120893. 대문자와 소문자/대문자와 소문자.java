class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if(65<=ch && ch<=90) {
                answer += (char) (ch + 32);
            } else if (97<=ch && ch<=122) {
                answer += (char) (ch - 32);
            }
        }
        return answer;
    }
}