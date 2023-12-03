class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        int idx = 0;
        for(String str : strArr) {
            intArr[idx] = Integer.parseInt(str);
            idx++;
        }
        
        int max = intArr[0];
        int min = intArr[0];
        
        idx = 0;
        for (int i : intArr) {
			max = Math.max(max, intArr[idx]);
			min = Math.min(min, intArr[idx]);
            idx++;
		}
        
        answer = min + " " + max;
        
        return answer;
    }
}