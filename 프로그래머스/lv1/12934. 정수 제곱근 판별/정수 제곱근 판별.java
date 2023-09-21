class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        answer = n%Math.sqrt(n) == 0 ? (long)Math.pow(x+1, 2) : -1;
        return answer;
    }
}