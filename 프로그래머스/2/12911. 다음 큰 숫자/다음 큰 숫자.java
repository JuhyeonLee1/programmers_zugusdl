class Solution {
    public int solution(int n) {
        int answer = n + 1;
        long count = Integer.bitCount(n);
        while(count !=  Integer.bitCount(answer)) {
            answer++;
        }
        return answer;
    }
}