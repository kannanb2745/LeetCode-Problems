class Solution {
    public boolean isHappy(int n) {
       if(n == 1 || n == 7) return true; //Edge cases
       else if(n<10) return false;
       else{
        int temp = 0;
        while(n!=0){
            temp += (n%10) * (n%10);
            n = n/10;
        }
        n = temp;
        return isHappy(n);
       } 
    }
}