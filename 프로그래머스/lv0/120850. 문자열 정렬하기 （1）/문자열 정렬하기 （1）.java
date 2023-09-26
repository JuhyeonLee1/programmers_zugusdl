import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String nums = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[nums.length()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = nums.charAt(i)-48;
        }        
        Arrays.sort(answer);        
        return answer;
    }
}