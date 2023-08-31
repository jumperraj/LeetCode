class Solution {
    public int uniquePaths(int m, int n) {
      int[][] grid = new int[m][n];
        int col=n-1,row=m-1;
        grid[row][col]=0;
        for(int i=0;i<=col;i++) grid[row][i]=1;
        for(int i=0;i<=row;i++) grid[i][col]=1;
        //  for(int i=0;i<=row;i++){
        //     for(int j=0;j<=col;j++)
        //     {
        //         System.out.print(grid[i][j]+" ");
        //     }
        //     System.out.println(" ");}
        col--;row--;
        while(row>=0)
        {
            while(col>=0){
            grid[row][col]=grid[row+1][col]+grid[row][col+1];
            col--;}
            col=n-2;
            row--;
        }
       
        return grid[0][0];
    }
}