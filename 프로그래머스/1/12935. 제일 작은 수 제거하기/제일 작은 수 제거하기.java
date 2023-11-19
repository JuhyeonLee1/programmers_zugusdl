class Solution {
    public int[] solution(int[] arr) {      
        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];
        int min = arr[0];
        for(int i : arr) {
            if(min > i) {
                min = i;
            }
        }
        int idx = 0;
        if(answer.length == 1) {
            answer = new int[] {-1};
        } else {
            for(int i=0; i<arr.length; i++) {
                if(min != arr[i]) {
                    answer[idx] = arr[i];
                    idx++;
                }
            }
        }
        
        return answer;
    }
}