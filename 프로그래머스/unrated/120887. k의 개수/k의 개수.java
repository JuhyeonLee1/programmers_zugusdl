class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k1 = String.valueOf(k);
        for(; i<=j; i++) {
            String i1 = String.valueOf(i);
            if(i1.indexOf(k1) != -1) {
                String[] str = i1.split("");
                for(int a=0; a<str.length; a++) {
                    if(str[a].equals(k1)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}