import java.util.Hashtable;
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=-1, j=-1;
        int c =0;
        int n = s1.length();
        if(s2.length() != n) return false;
        for(int index=0; index<n; index++){
            if(s1.charAt(index) != s2.charAt(index)) {
                if(i==-1) i=index;
                else if(j==-1) j=index;
                c++;
            }
        }
        if(c ==0 ) return true;
        else if(c==2){
            if(s1.charAt(j) == s2.charAt(i) && s1.charAt(i) == s2.charAt(j)) 
                return true;
        }
        return false;
…    }
}
