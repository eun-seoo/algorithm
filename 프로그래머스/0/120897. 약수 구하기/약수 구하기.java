import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> intList = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                intList.add(i);
            }
        }
        
        int[] intArray = intList.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        
        return intArray;
    }
}