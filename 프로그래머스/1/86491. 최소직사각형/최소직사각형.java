import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        Arrays.sort(sizes[0]);
        int a = sizes[0][0];
        int b = sizes[0][1];
        for(int[] size : sizes) {
            Arrays.sort(size);
            if(a < size[0]) a = size[0];
            if(b < size[1]) b = size[1];
        }
        return a * b;
    }
}