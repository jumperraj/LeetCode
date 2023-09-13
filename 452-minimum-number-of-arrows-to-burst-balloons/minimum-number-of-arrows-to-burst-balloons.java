class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,new Comparator<int[]>(){
          public int compare(int[] a, int[] b){
            if((long)a[1]-(long)b[1]>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                        if((long)a[1]-(long)b[1]<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                        return a[1]-b[1];

          }
        });
        int point=points[0][1];
        int count=1;

        for(int i=1;i<points.length;i++){

            if(points[i][0]<=point){ continue;}
            else {
            point=points[i][1]; count++;}
            // if(i<points.length-1&&points[i][0]<points[i+1][1]){point=points[i+1][0];}

             
        }
        return count;
    }
}