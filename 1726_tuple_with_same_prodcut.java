import java.util.Hashtable;
class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Hashtable<Integer, Integer> arr = new Hashtable<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int product = nums[i] * nums[j];
                arr.put(product, arr.getOrDefault(product, 0) + 1);
            }
        }
        int result =0;
        for(Map.Entry<Integer, Integer> entry: arr.entrySet()){
            int num = entry.getValue();
            result += 8 * ((num * (num-1))/2);
        } 
        return result;
    }
}
