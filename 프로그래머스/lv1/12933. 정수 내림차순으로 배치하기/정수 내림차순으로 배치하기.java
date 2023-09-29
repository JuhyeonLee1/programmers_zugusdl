import java.util.*;

class Solution {
    public long solution(long n) {
        String num = n + "";
        String str = "";
        char[] ch = num.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1; i>=0; i--) {
            str += ch[i];
        }
        return Long.parseLong(str);
    }
}