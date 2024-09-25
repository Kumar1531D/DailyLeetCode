class Solution {
    public int numSquares(int n) {
        if(n<=3)
			return n;
		
		int min = Integer.MAX_VALUE;
		
		int limit =(int) Math.sqrt(n) +1;
		
		for(int i=limit;i>=1;i--) {
			if(i*i<=n) {
				int y = (n/(i*i)) + numSquares(n%(i*i));
				if(y<min)
					min = y;
			}
		}
		
		return min;
    }
}
