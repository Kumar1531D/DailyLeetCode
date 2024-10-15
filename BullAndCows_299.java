class Solution {
    public String getHint(String secret, String guess) {
        int a[] = new int[10];
        int b[] = new int[10];

        int x = 0;
        int y = 0;

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)!=guess.charAt(i)){
                a[secret.charAt(i)-'0']++;
                b[guess.charAt(i)-'0']++;
            }
            else{
                x++;
            }
        }

        for(int i=0;i<10;i++){
            if(a[i]!=0&& b[i]!=0){
                y+=Math.min(a[i],b[i]);
            }
        }

        return ""+x+"A"+y+"B";
    }
}
