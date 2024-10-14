class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate(n,"",ans,0,0);

        return ans;
    }

    public void generate(int n,String temp,List<String> ans,int open,int close){
        if(close>n || open>n)
            return;

        if(close==n && open==n){
            ans.add(temp);
        }

        if(open<n){
            generate(n,temp+"(",ans,open+1,close);
        }

        if(close<open)
            generate(n,temp+")",ans,open,close+1);

    }
}
