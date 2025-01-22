class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums){
            result ^= i;  //Doing Xor operation return 0 if both are same and return same number if one is zero 
        }
        return result;
    }
}