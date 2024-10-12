class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            if(i==0){
                temp.add(1);
                ans.add(temp);
            }
            else if(i==1){
                temp.add(1);
                temp.add(1);
                ans.add(temp);
            }
            else{
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i)
                        temp.add(1);
                    else{
                        temp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                    }
                }

                ans.add(temp);
            }

        }

        return ans;
    }
}
