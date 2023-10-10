class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String n = String.valueOf(num);
        String strK = String.valueOf(k);
        for(int i=0; i<n.length(); i++) {
            if(Character.toString(n.charAt(i)).equals(strK)) {
                answer = n.indexOf(strK) + 1;
                break;
            }
        }
        return answer;
    }
}