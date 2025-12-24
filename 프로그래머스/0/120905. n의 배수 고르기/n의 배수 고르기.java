import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        // list 선언
        ArrayList<Integer> arr = new ArrayList<>();
        
        // 새로운 요소 추가
        for(int i : numlist) {
            if(i%n == 0) {
                arr.add(i);
            }
        }
      
        //리스트를 배열로 변환
        int[] newArr = arr.stream().mapToInt(i -> i).toArray();
        
        return newArr;
    }
}