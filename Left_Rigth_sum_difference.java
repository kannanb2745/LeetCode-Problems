class Left_Rigth_sum_difference {
    public int[] leftRightDifference(int[] nums) {
     int left =0, rigth =0;
     int[] ans = new int[nums.length];
     for(int i=0; i<nums.length; i++) rigth+=nums[i];
     for(int j=0; j<nums.length; j++){
        if(j ==0){
            rigth-=nums[j];
            ans[j] = Math.abs(left-rigth);
        }
        else{
            left+=nums[j-1];
            rigth-=nums[j];
            ans[j] = Math.abs(left-rigth);
        }
     }   
    return ans;
    }
}