import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> sList = new ArrayList<String>();
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                for(int j=0; j<i; j++) {
                    sList.add(str_list[j]);
                }
                break;
            }
            if(str_list[i].equals("r")) {
                for(int j=i+1; j<str_list.length; j++ ) {
                    sList.add(str_list[j]);
                }
                break;
            }
        }
        String[] answer = sList.toArray(new String[sList.size()]);
        
        return answer;
    }
}