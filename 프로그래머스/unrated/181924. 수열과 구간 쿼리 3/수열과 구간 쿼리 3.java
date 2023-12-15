class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        int num = 0;
        
        for(int i=0; i<queries.length; i++) {
            num = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = num;
        }

        return answer;
    }
}