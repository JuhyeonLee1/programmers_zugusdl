import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> strList = new ArrayList<String>();
        String str = "";
        str = myStr.replaceAll("[abc]", "_");
        String[] strarr = str.split("_");
        for(int i=0; i<strarr.length; i++) {
            if(!strarr[i].isEmpty()){
                strList.add(strarr[i]);            }
        }
        
        String[] answer = null;
        if(strList.size() == 0) {
            answer = new String[]{"EMPTY"};
        } else {
            answer = new String[strList.size()];
            for(int i=0; i<answer.length; i++) {
                answer[i] = strList.get(i);
            }
        }
        
        
        return answer;
    }
}