class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                //if the i element is not equal to val, then we will replace the kth element with the ith element
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}