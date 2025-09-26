import java.util.*;

class Solution {
    public int solution(String message) {
        StringBuilder arr = new StringBuilder();
        arr.append(message);
        return arr.toString().length() * 2;
    }
}