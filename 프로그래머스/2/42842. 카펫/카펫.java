class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow; // 전체 면적
        int width = 0; // 가로
        int height = 0; // 세로
        int b = 0; // 갈색 개수(비교용)
        int y = 0; // 노란색 개수(비교용)
        for(int i=sum; i>=1; i--) {
            if(sum % i != 0) continue;
            width = i;
            height = sum / i;
            y = (width - 2) * (height - 2);
            b = sum - y;
            if(yellow == y && brown == b) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        
        return answer;
    }
}