public String frequencySort(String s) {
        int a[] = new int[128];

        for(int i=0;i<s.length();i++){
            a[(int)s.charAt(i)]++;
        }

        int index = 0;

        StringBuilder ans = new StringBuilder();

        while(index<Math.min(128,s.length())){
            int max = 0;
            char c = '0';

            for(int i=0;i<128;i++){
                if(a[i]>max){
                    max = a[i];
                    c = (char)i;
                }
            }

            a[(int)c] = 0;

            for(int i=0;i<max;i++){
                ans.append(c);
            }
            index++;
        }

        return ans.toString();

    }
