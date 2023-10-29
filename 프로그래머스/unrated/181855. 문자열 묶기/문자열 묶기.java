class Solution {
    public int solution(String[] strArr) {
        int[] leng = new int[31];
        int answer = leng[0];
        for(int i=0; i<strArr.length; i++) {
            leng[strArr[i].length()]++;
        }
        for(int i=0; i<leng.length; i++) {
            answer = Math.max(answer, leng[i]);
        }
        return answer;
    }
}