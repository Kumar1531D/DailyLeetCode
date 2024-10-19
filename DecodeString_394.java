class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
		Stack<StringBuilder> words = new Stack<>();
		int n = 0;
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				n = (n*10) + (s.charAt(i)-'0');
			}
			else if(s.charAt(i)=='[') {
				nums.push(n);
				n= 0;
				words.push(ans);
				ans = new StringBuilder();
			}
			else if(s.charAt(i)==']') {
				int k = nums.pop();
				StringBuilder temp = ans;
				ans = words.pop();
				
				while(k-->0) {
					ans.append(temp);
				}
				
			}
			else
				ans.append(s.charAt(i));
		}
		
		return ans.toString();
    }
}
