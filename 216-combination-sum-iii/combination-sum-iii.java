class Solution {List<List<Integer>> lr = new ArrayList();
List<Integer> l = new ArrayList();
void  solve(int k,int n,int ind)
    {
        if(n==0&&k==0){ lr.add(new ArrayList(l));return;}
       for(int j=ind;j<10;j++)
       {
           l.add(j);
           solve(k-1,n-j,j+1);
           l.remove(l.size()-1);
       }
       
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(k,n,1);
        return lr;
    }
}