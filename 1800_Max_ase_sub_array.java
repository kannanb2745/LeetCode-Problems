class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        int prev = 0;
        for(int i=0; i<nums.length; i++){
            if(prev < nums[i]) sum+=nums[i];
            else sum = nums[i];
            prev = nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
