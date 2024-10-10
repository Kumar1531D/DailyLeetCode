class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int dp[][] = new int[nums2.length][nums1.length];
        int max = 0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(nums2[i]==nums1[j]){
                    if(i==0 || j==0){
                        dp[i][j] = 1;
                        max = Math.max(max,dp[i][j]);
                    }
                    else{
                        dp[i][j] =1+ dp[i-1][j-1];
                        max = Math.max(max,dp[i][j]);
                    }
                }
            }
        }

        return max;

    }
}
