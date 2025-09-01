class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lr = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean[] v = new boolean[nums.length];
        solve(lr,cur,nums,v);
        return lr;
    }
    void solve(List<List<Integer>> lr , List<Integer> cur , int[] nums , boolean[] v ){
        if(cur.size()==nums.length){
            lr.add(new ArrayList(cur));
        }
        for(int i =0; i<nums.length;i++){
            if(v[i]) continue;
            cur.add(nums[i]);
            v[i]=true;
            solve(lr,cur,nums,v);
            v[i]=false;
            cur.remove(cur.size()-1);
        }
    }
}