class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int a = Integer.valueOf(bin1, 2);
        int b = Integer.valueOf(bin2, 2);
        int c = a + b;
        answer = Integer.toBinaryString(c);
        
        return answer;
    }
}