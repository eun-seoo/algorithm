class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = (int)Math.sqrt(n);
        
        if(n == i*i){
            answer = 1;
        }else {
            answer = 2;
        }
        
        return answer;
    }
}