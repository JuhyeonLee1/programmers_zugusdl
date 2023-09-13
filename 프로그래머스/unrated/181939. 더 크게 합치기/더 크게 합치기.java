class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a2 = Integer.parseInt(a + "" + b);
        int b2 = Integer.parseInt(b + "" + a);
        answer = a2 >= b2 ? a2 : b2;
        return answer;
    }
}