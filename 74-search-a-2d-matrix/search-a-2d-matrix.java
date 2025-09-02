class Solution {
    boolean binary(int[] nums,int low,int high,int target){
        if(low>high) return false;
        int mid = (low+high)/2;
        if(nums[mid]==target) return true;
        if(nums[mid]>target) return binary(nums,low,mid-1,target);
        if(nums[mid]<target) return binary(nums,mid+1,high,target);
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(target==matrix[i][matrix[0].length-1]) return true;
            if(target<matrix[i][matrix[0].length-1]) return binary(matrix[i],0,matrix[0].length-1,target);
        }
        return false;
    }
}