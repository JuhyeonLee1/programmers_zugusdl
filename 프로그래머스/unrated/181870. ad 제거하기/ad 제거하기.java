import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> sArr = new ArrayList<String>();
        
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].indexOf("ad") == -1) {
                sArr.add(strArr[i]);
            }
        }

        String[] answer = new String[sArr.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = sArr.get(i);
        }
        return answer;
    }
}