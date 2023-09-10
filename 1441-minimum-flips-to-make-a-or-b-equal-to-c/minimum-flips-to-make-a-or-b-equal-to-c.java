class Solution {
    public int minFlips(int a, int b, int c) {
        int max= Math.max(Math.max(a,b),c);
        int count=0;
        while(max>0){
            if(c%2==1){
                if((a%2+b%2)<1){ count++; 
            //      a/=2;
            // b/=2;
            // c/=2;
            // max/=2; continue;
            }
            //     else if (b%2==0) {count++; a/=2;
            // b/=2;
            // c/=2;
            // max/=2; continue;
            
            }
            else {
                if((a%2+b%2)==1) count++;
                if((a%2+b%2)==2) count+=2;
            }
            a/=2;
            b/=2;
            c/=2;
            max/=2;
        }
        return count;
    }
}