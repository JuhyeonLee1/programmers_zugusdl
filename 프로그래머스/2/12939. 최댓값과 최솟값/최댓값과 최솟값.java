import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        int idx = 0;
        for(String str : strArr) {
            intArr[idx] = Integer.parseInt(str);
            idx++;
        }
        
        Arrays.sort(intArr);
        
        int min = intArr[0];
        int max = intArr[intArr.length - 1];
        
        answer = min + " " + max;
        
        return answer;
    }
}