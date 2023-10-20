class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer;
        int sub = 0;
        
        if(my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];
        } else {
            answer = new String[my_str.length() / n + 1];
        }
        
        for(int i=0; i<answer.length; i++) {
            if(sub + n < my_str.length()) {
                answer[i] = my_str.substring(sub, sub + n);
                sub += n;
            } else {
                answer[i] = my_str.substring(sub);
            }
        }
        
        return answer;
    }
}