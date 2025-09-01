class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l  = new ArrayList();
        solve(0,0,"",n,l);
        return l;
    }
    void solve(int o , int c , String s ,int n , List<String> l){
        if(o==c && o+c ==n*2) l.add(s);
        if(o<n){
            solve(o+1,c,s+"(",n,l);
        }
        if(c<o) solve(o,c+1,s+")",n,l);
    }
}