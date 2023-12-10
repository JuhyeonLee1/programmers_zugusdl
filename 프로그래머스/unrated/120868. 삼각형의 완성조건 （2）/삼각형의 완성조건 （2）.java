class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // 배열에 있는 수가 가장 긴 변일 때
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        for(int i = max; min + i > max; i--) {
            answer++;
        }
        
        // 다른 수가 가장 긴 변일 때
        for(int i = max + 1; max + min > i; i++) {
            answer++;
        }
                
        return answer;
    }
}