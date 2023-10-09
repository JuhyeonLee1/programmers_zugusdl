import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> s = new ArrayList<String>();
        
        for(int i=0; i<todo_list.length; i++) {
            if(finished[i] == false) {
                s.add(todo_list[i]);
            } 
        }
        
        String[] answer = new String[s.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = s.get(i);
        }
        return answer;
    }
}