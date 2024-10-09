class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> val = new HashMap<>();

        for(int a[] : reservedSeats){
            Set<Integer> temp = val.getOrDefault(a[0],new HashSet<>());
            temp.add(a[1]);
            val.put(a[0],temp);
        }
        int count = 2 * (n-val.size());

        for(Set<Integer> s : val.values()){
            count += rec(s);
        }

        return count;
    }

    public int rec(Set<Integer> s){
        int count = 0;

        if(!s.contains(2) && !s.contains(3) && !s.contains(4) && !s.contains(5))
            count++;
        
        if(!s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9))
            count++;

        if(count==1 || count==2)
            return count;

        if(!s.contains(4) && !s.contains(5) && !s.contains(6) && !s.contains(7))
            count++;
        
        return count;
    }
}
