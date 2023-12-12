class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for(int i=n; i>=1; i--) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        int i = m;
        while(i % m != 0 || i % n != 0) {
            i++;
        }
        answer[1] = i;
        return answer;
    }
}