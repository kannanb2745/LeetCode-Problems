class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] i : accounts){
            int temp =0;
            for(int j : i){
                temp= temp + j;
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}
