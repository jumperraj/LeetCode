class Solution {
    int binary(int high, int low, int[] nums){
        int mid= (high+low)/2;
        // System.out.println("mid "+mid);
        if(mid==0&&nums[mid+1]<nums[mid]){ return mid;
        }
        if(mid==nums.length-1&&nums[mid]>nums[mid-1]) return mid;
        if(nums[mid-1]<nums[mid]&&nums[mid+1]<nums[mid]) return mid;
        // int left, right;
        if(nums[mid]<nums[mid+1]){
            return binary(high,mid+1,nums);
        }
        else return binary(mid,low,nums);

    }
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums.length==2){
            return nums[0]>nums[1] ? 0 : 1;
        }
        return binary(nums.length-1,0,nums);
    }
}