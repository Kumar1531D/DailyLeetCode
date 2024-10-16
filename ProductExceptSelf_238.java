class Solution {
    public int[] productExceptSelf(int[] nums) {
        int right[] = new int[nums.length];
        int left[] = new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1)
                right[i] = 1;
            else{
                right[i] = right[i+1]*nums[i+1];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i==0)
                left[i] = 1;
            else{
                left[i] = left[i-1] * nums[i-1];
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = right[i]*left[i];
        }

        return nums;
    }
}
