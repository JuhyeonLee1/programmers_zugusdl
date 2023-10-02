class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long p = 0;
        long sum = 0;
        for(int i=1; i<=count; i++) {
            p += price;
            sum += p;
        }
        answer = money > sum ? 0 : sum - money;
        return answer;
    }
}