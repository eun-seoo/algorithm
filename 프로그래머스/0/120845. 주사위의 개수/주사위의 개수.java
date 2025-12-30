class Solution {
    public int solution(int[] box, int n) {
        int[] answer = new int[3];
        int sum = 1;

        for(int i = 0; i < box.length; i++) {
            answer[i] = box[i]/n;
            sum *= answer[i];
        }
            
        return sum;
    }
}