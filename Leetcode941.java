class Solution {
    public boolean validMountainArray(int[] arr) {

        if(arr.length<3)
            return false;

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            int tempI = i;
            int tempJ = j;

            if(arr[i]<arr[i+1])
                i++;

            if(arr[j]<arr[j-1])
                j--;

            if(tempI==i && tempJ==j)
                break;
            
        }

        if(i==0 || j==arr.length-1)
            return false;

        return i==j;
        
    }
}
