class Solution {
    public int solution(int n, int k) {
        if(0.1*n>0){
            k = k - (n/10);
        }
        int a = 12000 * n;
        int b = 2000 * k;
        int result = a + b;
        return result;
    }
}