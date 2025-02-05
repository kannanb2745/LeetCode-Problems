class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int n = s.length()-1;
        boolean flag = true;
        for(int i=n; i>=0; i--){
            if(flag && s.charAt(i)==' ') continue;
            else if(s.charAt(i) != ' ' && flag){
                flag = false;
                count++;
            }
            else if(s.charAt(i) ==' ' && flag==false) break;
            else count++;
        }   
        return count;
    }
}
