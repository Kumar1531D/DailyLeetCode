class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxElement = 0;
		
		for(int i=1;i<nums.length;i++){
          if(nums[i]>maxElement)
              maxElement = nums[i];
		}
		
		int bit = 31;

        while(bit-- >= 0) {
            if((maxElement >> bit & 1) == 1) break;
        }
		
		Trie3 t = new Trie3();
		Trie3 root = new Trie3();
		
		for(int n : nums) {
			t.insert(n, root,bit);
		}
		
		int max = 0;
		
		for(int n : nums) {
			max = Math.max(max, t.search(n, root,bit));
		}
		
		return max;
    }
}

class Trie3{
    Trie3 children[] = new Trie3[2];

    Trie3(){
    }

    public void insert(int num,Trie3 root,int maxBit){
        Trie3 cur = root;
        
        for(int i=maxBit;i>=0;i--) {
        	int bit = (num>>i)&1;
        	
        	if(cur.children[bit]==null)
        		cur.children[bit] = new Trie3();
        	
        	cur = cur.children[bit];
        }
    }

    public int search(int num,Trie3 root,int maxBit){
        Trie3 cur = root;
        int max = 0;
        
        for(int i=maxBit;i>=0;i--) {
        	int bit = (num>>i)&1;
        	int opposite = bit^1;
        	
        	if(cur.children[opposite]!=null) {
        		max |= (1<<i);
        		cur = cur.children[opposite];
        	}
        	else
        		cur = cur.children[bit];
        }
        
        return max;
    }
}
