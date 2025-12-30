import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                sum.add(numbers[i]*numbers[j]);
            }
        }
        
        int maxVal = Collections.max(sum);
        
        return maxVal;
    }
}