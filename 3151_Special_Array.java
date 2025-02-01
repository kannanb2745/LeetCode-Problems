class Solution {
    public boolean isArraySpecial(int[] nums) {
        int flag = 0;
        if (nums[0]%2==0 && nums.length>0) flag = 1;
        else flag = 2; 
        for (int i=0; i<nums.length; i++){
            if(flag == 1){
                if(nums[i]%2 != 0) return false;
                flag++;
            }
            else if(flag == 2){
                if(nums[i]%2 == 0) return false;
                flag--;
            }
        }
        return true;
    }
}
