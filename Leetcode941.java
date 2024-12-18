class Solution {
    public boolean validMountainArray(int[] arr) {

       int i = 0;
        int j = arr.length-1;

        while(i<arr.length-1 && arr[i]<arr[i+1]){
            i++;
        }

        if(i==0 || i==arr.length-1)
            return false;

        while(j>=0 && arr[j]<arr[j-1]){
            j--;
        }

        if(j==0 || j==arr.length-1)
            return false;

        return i==j;
        
    }
}
