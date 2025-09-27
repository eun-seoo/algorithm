class Solution {
    public int solution(int n) {
        int[] arr = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}