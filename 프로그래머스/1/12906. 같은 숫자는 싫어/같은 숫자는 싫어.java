import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(i > 0) {
				if(arr[i] != arr[i-1]) {
					list.add(arr[i]);
				}
			} else {
				list.add(arr[i]);
			}
		}
		
		int[] answer = new int[list.size()];
		int idx = 0;
		
		for(int i : list) {
			answer[idx++] = i;
		}

        return answer;
    }
}