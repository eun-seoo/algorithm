class Solution {
    public int solution(int hp) {
        int answer = 0;
        int x = 0;
        int y = 0;
        int i = 0;
        int j = 0;
        
        if(hp >= 0) {
            i += hp/5;  // 4
            j += hp%5;  // 나머지가 4
            x += j/3;  // 1
            y += j%3;
        }
        
        answer = i + x + y;
        
        return answer;
    }
}