class Solution {
    public boolean check(int[] nums) {
        int max =nums[0];
        int flag=0;
        for(int i=1;i<nums.length;i++){
            if(flag==1 &&nums[i-1]>nums[i]) return false;
            if(nums[i-1]>nums[i]){
                flag=1;
            }
            // if(flag==1 &&nums[i-1]>nums[i]) return false;
            
        }
       int  min=nums[nums.length-1];
        if(flag==1&&min>max) return false;
        return true;
    }
}