class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int n = grid.length ;
        int  m= grid[0].length;
        char[][] res = new char[m][n];
        for(int i =0 ; i< m ; i++){
            for(int j=0; j< n ;j++)
                res[i][j] = grid[n-1-j][i];
        }
       for(int j = 0 ;j< n;j++){
        int i = m-1;
        int count=0;
        int jind =0;
        while(i>=0){
            jind = i;
            while(i>=0&&res[i][j]!='*'){
                if(res[i][j]=='#'){
                count++;
                res[i][j]='.';
            }
            i--;
        }
        i--;
        while(count>0&&jind>=0){
            res[jind][j]='#';
            count--;
            jind--;
        }
    }
       }
        return res;
    }
}