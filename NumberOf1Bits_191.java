class Solution {
    public int hammingWeight(int n) {
        int ans = 0;

        while(n!=1){
            if(n%2==1)
                ans++;

            n/=2;
        }

        return ans+1;
    }
}