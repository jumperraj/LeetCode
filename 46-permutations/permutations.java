import java.util.ArrayList;
import java.util.List;

class Solution{ public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> lr = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    boolean[] v = new boolean[nums.length];
    solve(nums,v,cur,lr);
    return lr;
}
static void solve(int[] nums, boolean[] v, List<Integer> cur, List<List<Integer>> lr)
{
    if(cur.size()==nums.length)
    {
        lr.add(new ArrayList<>(cur));
    }
  for(int i=0;i<nums.length;i++)
  {
      if(v[i])
          continue;
      cur.add(nums[i]);
      v[i]=true;
      solve(nums,v,cur,lr);
      v[i]=false;
      cur.remove(cur.size()-1);

  }
}
}