class Solution {
    public boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        if (n <= 3){
            return true;
        }  
        if (n % 2 == 0 || n % 3 == 0){
            return false;
…    }
}
