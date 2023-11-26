import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);

        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i=0; i<indices.length; i++) {
        	int index = indices[i] - i;
        	sb.deleteCharAt(index);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}