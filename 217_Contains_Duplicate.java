import java.util.Hashtable;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0; i<nums.length; i++){
            if(table.containsKey(nums[i]) == false){
                table.put(nums[i], i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
