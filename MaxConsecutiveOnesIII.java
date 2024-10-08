class Solution {
    public int longestOnes(int[] nums, int k) {
         int max = 0;
        int i = 0;
        int j = 0;

        while(i<nums.length && j<nums.length){
          while(j<nums.length && ((k>0 && nums[j]==0) || nums[j]==1)){
            if(nums[j]==0)
                k--;
            j++;
          }

          max = Math.max(max,j-i);

          while(i<nums.length && nums[i]==1)
            i++;
        i++;
        k++;
           
        }

        return max;
    }
}
