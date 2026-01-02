class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(Character.isLowerCase(ch[i])){
                answer += Character.toUpperCase(ch[i]);
            }else {
                answer += Character.toLowerCase(ch[i]);
            }
        }
        
        //String answer = String.valueOf(ch);
        
        return answer;
    }
}