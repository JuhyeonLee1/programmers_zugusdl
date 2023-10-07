class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0; i<order.length; i++) {
            if(order[i].indexOf("americano") != -1 || order[i].indexOf("anything") != -1) {
                answer += 4500;
            } else if (order[i].indexOf("cafelatte") != -1) {
                answer += 5000;
            }
        }
        return answer;
    }
}