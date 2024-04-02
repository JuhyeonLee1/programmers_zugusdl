import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i].substring(s, s + l);
            int j = Integer.parseInt(str);
            if(j > k) {
                list.add(j);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}