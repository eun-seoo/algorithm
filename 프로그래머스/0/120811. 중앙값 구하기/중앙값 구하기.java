import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++) {
            if(i == array.length/2) {
               answer += array[i]; 
            } 
        }
        
        return answer;
    }
}