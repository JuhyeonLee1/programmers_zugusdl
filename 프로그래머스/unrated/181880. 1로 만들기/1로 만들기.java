class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++) {
            for(int j=num_list[i]; j!=1; ) {
                j = j % 2 == 0 ? j / 2 : (j - 1) / 2;
                answer++;
            }
        }
        return answer;
    }
}