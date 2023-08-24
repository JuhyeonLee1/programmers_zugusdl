class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int mul = 1;
        for(int i=0; i<num_list.length; i++) {
            add += num_list[i];
            mul *= num_list[i];
        }
        return add*add > mul ? 1 : 0;
    }
}