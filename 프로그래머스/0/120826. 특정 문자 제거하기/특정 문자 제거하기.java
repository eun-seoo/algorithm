import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        
        String[] answer = my_string.split(letter);
        String answerToString = String.join("", answer);
        

        return answerToString;
    }
}