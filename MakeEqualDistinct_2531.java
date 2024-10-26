class Solution {
    public boolean isItPossible(String word1, String word2) {
        int a[] = new int[26];
        int b[] = new int[26];

        for(int i=0;i<word1.length();i++){
            a[word1.charAt(i)-'a']++;
        }

        for(int i=0;i<word2.length();i++){
            b[word2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(b[i]==0)
                continue;
            for(int j=0;j<26;j++){
                if(a[j]==0)
                    continue;

                a[j]--;
                b[j]++;
                a[i]++;
                b[i]--;

                int count1 = 0;
                int count2 = 0;

                for(int k=0;k<26;k++){
                    if(a[k]!=0){
                        count1++;
                    }
                    if(b[k]!=0){
                        count2++;
                    }
                }

                if(count1==count2)
                    return true;

                a[j]++;
                b[j]--;
                a[i]--;
                b[i]++;
            }
        }

        return false;
    }
}
