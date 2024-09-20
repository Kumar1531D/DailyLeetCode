class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==goal.charAt(0)){
                String temp = s.substring(i)+s.substring(0,i);
                if(temp.equals(goal))
                    return true;
            }
        }

        return false;
    }

    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String s = in.next();
      System.out.println(rotateString(s));
      
    }
}
