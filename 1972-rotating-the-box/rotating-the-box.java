class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        int n = grid.length ;
        int  m= grid[0].length;
        char[][] res = new char[m][n];
        for(int i =0 ; i< m ; i++){
            for(int j=0; j< n ;j++)
                res[i][j] = grid[n-1-j][i];
            System.out.println("i "+i);
        }
       for(int j = 0 ;j< n;j++){
        int i = m-1;
        int count=0;
        while(i>=0){
            int jind = i;
            while(i>=0&&res[i][j]!='*'){
            // System.out.println("res[i][j] "+res[i][j]+" i "+i+" j "+j);
                if(res[i][j]=='#'){
                count++;
                res[i][j]='.';
                // System.out.println("s001");
            }
            i--;
        }
        i--;
        // if(count==0){
        //     continue;
        // }
        while(count>0&&jind>=0){
            res[jind][j]='#';
            count--;
            jind--;
            // System.out.println("s002");
        }
        // System.out.println("s003 j"+j+" i "+i);
        }
       }
        return res;
    }
}