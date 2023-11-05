class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = intervals[0][1] - intervals[0][0] + 1 + intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[length];
        int count = 0;
        for(int i=0; i<answer.length; i++) {
            if(count < intervals[0][1] - intervals[0][0] + 1) {
                answer[i] = arr[intervals[0][0]+i];
                count++;
            } else {
                answer[i] = arr[intervals[1][0]+i-count];
            }
        }
        return answer;
    }
}