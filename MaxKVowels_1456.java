class Solution {
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }

        return false;
    }

    public int maxVowels(String s, int k) {
        int max = 0;

        int ans = 0;

        int i = 0;
        int j = 0;

        while(i<=s.length()-k){
            if(j-i==k-1){
                if(j<s.length() && isVowel(s.charAt(j))){
                    max++;
                }
                if(max>ans)
                    ans = max;

                if(i<s.length() && isVowel(s.charAt(i)))
                    max--;
                j++;
                
                i++;
                continue;
          
            }

            if(j<s.length() && isVowel(s.charAt(j)))
                max++;
            j++;

        }

        return ans;
    }
}
