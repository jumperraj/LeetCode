class Solution {

    public static int maxArea(int[] nums) {
        int max = 0;
        int i = 0, j = nums.length-1;
        while (i < nums.length && j>=0 ) {


            if(max<(j-i)*(Math.min(nums[i],nums[j]))) {
                max = (j-i) * (Math.min(nums[i], nums[j]));

            }
            if(nums[i]<nums[j]) {
                i++;
                continue;
            }

            if(nums[i]>nums[j]){
                    j--;
            continue;
            }
            else{i++;j--;}


        }
        return max;
    }
}