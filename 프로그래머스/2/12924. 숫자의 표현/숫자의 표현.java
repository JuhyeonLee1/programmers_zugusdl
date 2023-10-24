class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            int j = 0;
            for(int k=i; j<=n; k++) {
                j += k;
                if(j == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}