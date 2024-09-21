public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;

        int count = 0;

        while(i>=0 || j>=0){
            if(i>=0 && s.charAt(i)=='#'){
                count++;
                i--;
                while(i>=0 && (count>0 || s.charAt(i)=='#')){
                    if(s.charAt(i)=='#')
                        count++;
                    else
                        count--;
                    i--;
                }
             
                count = 0;
            }
            if(j>=0 && t.charAt(j)=='#'){
                count++;
                j--;
                while(j>=0 && (count>0 || t.charAt(j)=='#')){
                    if(t.charAt(j)=='#')
                        count++;
                    else
                        count--;
                    j--;
                }
                count = 0; 
            }

            if(i>=0 && j>=0 && s.charAt(i)==t.charAt(j)){
                i--;
                j--;
            }
            else if((i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)) || (i>=0 && j<0) || (i<0 && j>=0)){
                return false;
            }
        }

        

        
        return true;
    }
