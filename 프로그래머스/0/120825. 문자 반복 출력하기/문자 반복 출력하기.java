import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // string -> string[]
        char[] my_stringArr = my_string.toCharArray();
        
        for(int i = 0; i < my_stringArr.length; i++) {
            for(int j=0; j < n; j++) {
                answer += my_stringArr[i];
            }
        }
                
        return answer;
    }
}