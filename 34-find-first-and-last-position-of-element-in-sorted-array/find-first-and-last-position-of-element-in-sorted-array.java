class Solution {
    int[] binary(int[] nums,int target,List<Integer> l ,int high,int low){
        if(high<low) return new int[]{-1,-1};
        int mid = (low+high)/2;
        if(nums[mid]==target){
            int i=mid;int j=mid+1;
            while(i>=0&&target==nums[i]){i--;}
            while(j<nums.length&&target==nums[j]){j++;}

            return new   int[]{i+1,j-1};
        }
        if(nums[mid]>target) return binary(nums,target,l,mid-1,low);
        if(nums[mid]<target) return binary(nums,target,l,high,mid+1);
        return new int[]{-1,-1};
    }
    public int[] searchRange(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int[] res;
        // if(binary(nums,target,l,nums.length-1,0)){
        //     res= new int[l.size()];
        //     for(int i=0;i<res.length;i++){
        //         res[i]=l.get(i);
        //     }
        //     return res;
        // }
        return binary(nums,target,l,nums.length-1,0);
    }
}