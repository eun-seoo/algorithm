import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String str = my_string.replaceAll("[a-z]", ""); //소문자 치환
        
        answer = str.chars() //string -> int[]
                        .map(Character::getNumericValue)
                        .toArray();
        
        Arrays.sort(answer); //오름차순 변환 
        
        return answer;
    }
}