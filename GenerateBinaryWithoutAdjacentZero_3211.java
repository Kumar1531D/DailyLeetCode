class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();

        rec(n,"",res);

        return res;
    }

    public void rec(int n ,String temp,List<String> res){
        if(temp.length()==n){
            res.add(temp);
            return;
        }

        if(temp.length()==0){
            rec(n,temp+"0",res);
            rec(n,temp+"1",res);
        }
        else{
            if(temp.charAt(temp.length()-1)!='0'){
                rec(n,temp+"0",res);
            }
            rec(n,temp+"1",res);

        }
    }
}
