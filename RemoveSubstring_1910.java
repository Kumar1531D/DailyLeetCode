class Solution {
    public String removeOccurrences(String s, String part) {
        int i = 0;
        Stack<Character> val = new Stack<>();
        int j = 0;

        while(i<s.length()){
            val.push(s.charAt(i));
            if(val.size()>=part.length() && val.peek()==part.charAt(part.length()-1)){
                StringBuilder temp = new StringBuilder();
                int index = part.length()-1;

                for(int k=0;k<=index && !val.isEmpty();k++){
                    temp.insert(0,val.pop());
                }

                if(!temp.toString().equals(part)){
                    for(int m=0;m<temp.length();m++){
                        val.push(temp.charAt(m));
                    }
                }

            }
            i++;
        }

        StringBuilder ans = new StringBuilder();

        while(!val.isEmpty()){
        	ans.insert(0, val.pop()); 
           // ans = val.pop()+ans;
        }

        return ans.toString();

    }
}

