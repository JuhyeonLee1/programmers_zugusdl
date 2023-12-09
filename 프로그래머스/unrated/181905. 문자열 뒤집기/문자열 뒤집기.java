import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] sArr = my_string.split("");
        int num = e;
        for(int i=s; i<=e; i++) {
            sArr[i] = Character.toString(my_string.charAt(num));
            num--;
        }
        answer = String.join("", sArr);
        return answer;
    }
}