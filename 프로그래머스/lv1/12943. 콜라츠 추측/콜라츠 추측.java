class Solution {
    public int solution(int num) {
        int answer = 0;
        for(long i=num; i!=1; ) {
            answer++;
            if(i % 2 == 0) {
                i /= 2;                
            } else {
                i = (i * 3) + 1;
            }
        }
        if(answer > 500) {
            answer = -1;
        }
        return answer;
    }
}