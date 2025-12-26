class Solution {
    public int[] solution(int money) {
        
        int i = money / 5500;
        int j = money % 5500;
        int[] answer = {i, j};
        
        return answer;
    }
}