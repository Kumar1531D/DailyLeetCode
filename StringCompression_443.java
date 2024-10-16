class Solution {
    public int compress(char[] chars) {
       int i = 0;
       int k = 0;

       while(i<chars.length){
        int temp = 1;
        while(i+temp<chars.length && chars[i+temp]==chars[i])
            temp++;

        if(temp==1)
            chars[k++] = chars[i];
        else{
            chars[k++] = chars[i];
            String s = String.valueOf(temp);
            for(int j=0;j<s.length();j++){
                chars[k++] = s.charAt(j);
            }
        }
        i+=temp;
       }

       return k;
    }
}
