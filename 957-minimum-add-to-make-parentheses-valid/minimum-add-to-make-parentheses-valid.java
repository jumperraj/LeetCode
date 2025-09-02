class Solution {
    public int minAddToMakeValid(String s) {
        int ob =0;
        int cb=0;
        char[] arr = s.toCharArray();
        for(char  c : arr){
            if(c == '(') ob++;
            else if( c ==')' && ob>0) ob--;
            else cb++;
        }
        return ob+cb;
    }
}