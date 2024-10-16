class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
            
        Map<Character, String> letters = Map.of( '2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
        List<String> res = new ArrayList<>();

        rec(digits,letters,res,"",0);

        return res;

    }

    public void rec(String digits,Map<Character, String> letters,List<String> res,String temp,int index){
        if(temp.length()==digits.length()){
            res.add(temp);
            return;
        }

        String word = letters.get(digits.charAt(index));

        for(int i=0;i<word.length();i++){
            rec(digits,letters,res,temp+word.charAt(i),index+1);
        }
    }
}
