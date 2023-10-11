import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arr_list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++) {
            arr_list.add(arr[i]);
        }
        
        for(int i=0; i<delete_list.length; i++) {
            for(int j=0; j<arr_list.size(); j++) {
                if(delete_list[i] == arr_list.get(j)) {
                    arr_list.remove(j);
                }
            }
        }
        
        int[] answer = new int[arr_list.size()];
        
        for(int i=0; i<arr_list.size(); i++) {
            answer[i] = arr_list.get(i);
        }
        
        return answer;
    }
}