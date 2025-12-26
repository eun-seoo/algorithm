import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {

         // list 선언
        ArrayList<Integer> answer = new ArrayList<>();
        int sum = 0;
        
        for(int i = 0; i < strlist.length; i++) {
            for(char x : strlist[i].toCharArray()) {
                sum++;
            }
            answer.add(sum);
            sum = 0;
        }
        
        //리스트를 배열로 변환
        int[] newArr = answer.stream().mapToInt(i -> i).toArray();
        
        return newArr;
    }
}