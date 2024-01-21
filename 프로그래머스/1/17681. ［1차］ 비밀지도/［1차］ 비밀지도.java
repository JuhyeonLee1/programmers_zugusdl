class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binaryArr1 = new String[n];
        String[] binaryArr2 = new String[n];
        for(int i=0; i<n; i++) {
            binaryArr1[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            binaryArr2[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr2[i])));
        }
        
        for(int i=0; i<binaryArr1.length; i++) {
            answer[i] = "";
            for(int j=0; j<binaryArr1[i].length(); j++) {
                if(binaryArr1[i].charAt(j) == '0' && binaryArr2[i].charAt(j) == '0') {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }
        
        return answer;
    }
}