class Solution {
    public int minLength(String s) {
        
        Stack<Character> val = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(!val.isEmpty() && ((val.peek()=='A' && s.charAt(i)=='B') || (val.peek()=='C' && s.charAt(i)=='D'))){
                val.pop();
                continue;
            }
            else{
                val.push(s.charAt(i));
            }
        }

        return val.size();
    }
}
