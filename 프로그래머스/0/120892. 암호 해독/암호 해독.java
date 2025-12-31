import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String cipher, int code) {
        
        List<Character> arr = new ArrayList<Character>();
        
        for(int i = 0; i < cipher.length(); i++) {
            if((i+1) % code == 0) {
                arr.add(cipher.charAt(i));
            }
        }
        
        String answer = arr.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining());
        
        return answer;
    }
}