class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean b1 = true;
        boolean b2 = true;
        if(x1 == false && x2 == false) {
            b1 = false;
        }
        if(x3 == false && x4 == false) {
            b2 = false;
        }
        if(b1 == true && b2 == true) {
            answer = true;
        }
        return answer;
    }
}