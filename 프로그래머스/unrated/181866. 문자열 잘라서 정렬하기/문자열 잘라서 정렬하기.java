import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        ArrayList<String> str_list = new ArrayList<String>();
        
        for(int i=0; i<str.length; i++) {
            if(!str[i].equals("")) {
                str_list.add(str[i]);
            }
        }
        
        String[] answer = new String[str_list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = str_list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}