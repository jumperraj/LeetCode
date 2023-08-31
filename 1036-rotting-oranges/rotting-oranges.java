class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> pq = new LinkedList<>();
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2)pq.add(new int[]{i,j});
                if(grid[i][j]==1)count++;
            }
        }
        if(count==0) return 0;
        if(pq.isEmpty()) return -1;
        int min=-1;
        int v[][] = new int[grid.length][grid[0].length];
        while(!pq.isEmpty()){
            int size=pq.size();
            while(size-->0){
            int rot[]=pq.poll();
            // if(v[rot[0]][rot[1]]==1){ continue;}
            // v[rot[0]][rot[1]]=1;
            int r=rot[0],c=rot[1];
                        // System.out.println("r "+r+" c "+c );

            if(r>0&&grid[r-1][c]==1){grid[r-1][c]=2;pq.add(new int[]{r-1,c});count--;}
            if(r<grid.length-1&&grid[r+1][c]==1){grid[r+1][c]=2;pq.add(new int[]{r+1,c});count--;}
            if(c>0&&grid[r][c-1]==1){grid[r][c-1]=2;pq.add(new int[]{r,c-1});count--;}
            if(c<grid[0].length-1&&grid[r][c+1]==1){grid[r][c+1]=2;pq.add(new int[]{r,c+1});count--;}
           
           
        } min++;}
         if(count==0) return min;
        return -1;
    }
}