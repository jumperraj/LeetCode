class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int dp[][] = new int[triangle.size()][triangle.size()];
       dp[0][0]= triangle.get(0).get(0);
       if(triangle.size()<=1) return dp[0][0];
       dp[1][0]=triangle.get(1).get(0)+dp[0][0];
       dp[1][1]=triangle.get(1).get(1)+dp[0][0];
       int i;
       int min=Math.min(dp[1][0],dp[1][1]);
       for(i=2;i<triangle.size();i++){
        List<Integer> l = triangle.get(i);
        int s= l.size();
        min=Integer.MAX_VALUE;
        dp[i][0]=dp[i-1][0]+l.get(0); 
        min=Math.min(dp[i][0],min);
        dp[i][s-1]= dp[i-1][s-2]+l.get(s-1);
        min=Math.min(dp[i][s-1],min);
        for(int j =1; j<s-1;j++){
            dp[i][j]= Math.min(dp[i-1][j-1],dp[i-1][j])+l.get(j);
            min=Math.min(dp[i][j],min);
        }
        }
        return min;
    }
}