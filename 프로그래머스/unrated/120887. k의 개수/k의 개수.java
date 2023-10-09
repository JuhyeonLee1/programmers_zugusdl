class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i<=j; i++) {
            String[] str = (i+"").split("");
            for(int a=0; a<str.length; a++) {
                if(str[a].equals(k+"")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}