public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] prefix = new int[nums.Length];
        int[] suffix = new int[nums.Length];
        int[] res = new int[nums.Length];
        int i=0;
        int j=nums.Length-1;
        prefix[0]=nums[0];
        suffix[nums.Length-1]=nums[nums.Length-1];
        while(i<nums.Length-1&&j>0){
            prefix[i+1]=prefix[i]*nums[i+1];
            suffix[j-1]=suffix[j]*nums[j-1];
            i++;
            j--;
        }
        res[0]=suffix[1];
        res[nums.Length-1]=prefix[nums.Length-2];
        i=1;
        while(i<nums.Length-1){
            res[i]=prefix[i-1]*suffix[i+1];
            i++;
        }
        return res;

    }
}