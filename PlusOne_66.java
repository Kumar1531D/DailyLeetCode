class Solution {
    public int[] plusOne(int[] digits) {
int div = 1;
        int i = digits.length-1;
        boolean flag = true;

        while(i>=0 && flag){
        	if((digits[i]+div)%10!=0)
        		flag = false;
            
        	int temp = (digits[i]+div)/10;
        	
            digits[i] = (digits[i]+div)%10;
            
            div =  temp;

            i--;
        }

        if(digits[0]!=0)
            return digits;
        
        int ans[] = new int[digits.length+1];
        ans[0] = div;

        return ans;
        
    }
}
