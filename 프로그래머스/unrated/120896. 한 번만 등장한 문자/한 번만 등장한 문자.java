import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String s2 = "";
        String[] sArr = s.split("");
        
        for(int i=0; i<sArr.length; i++) {
            int count = 0;
            for(int j=0; j<sArr.length; j++) {
            	if(i == j) {
            		continue;
            	}else if(sArr[i].equals(sArr[j])) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                s2 += sArr[i];
            }
        }
        
        sArr = s2.split("");
        Arrays.sort(sArr);
        
        StringBuilder sb = new StringBuilder();
        for (String str : sArr) {
            sb.append(str);
        }

        return sb.toString();
    }
}