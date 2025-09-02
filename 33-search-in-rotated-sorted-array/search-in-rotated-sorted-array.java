class Solution {
    int binary(int low,int high,int target,int nums[]){
        int mid= (low+high)/2;
        if(low>high) return -1;
        if(nums[mid]==target) return mid;
        if(nums[mid]>target) return binary(low,mid-1,target,nums);
        if(nums[mid]<target) return binary(mid+1,high,target,nums);
        return -1;
    }
    public int search(int[] nums, int target) {
        int i=0;
        for(i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) break;
        }
        // System.out.println("i "+i);
        int res = binary(0,i,target,nums);
        if(res!=-1) return res;
        // res =
        // if( res!=-1) return nums[res];
        return binary(i+1,nums.length-1,target,nums);

    }
}