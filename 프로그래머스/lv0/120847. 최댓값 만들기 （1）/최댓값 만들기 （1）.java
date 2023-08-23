class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int k = numbers[i]*numbers[j];
                if(k > answer){
                    answer = k;
                }
            }
        }
        return answer;
    }
}