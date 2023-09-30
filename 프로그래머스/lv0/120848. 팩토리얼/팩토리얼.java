class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul = 1;
        int i = 1;
        while (mul <= n) {
            mul *= i;
            if(mul > n) {break;}
            answer = i;
            i++;
        }
        return answer;
    }
}