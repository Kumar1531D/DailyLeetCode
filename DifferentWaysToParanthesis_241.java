class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        if(expression.length()<3){
            res.add(Integer.parseInt(expression.substring(0)));
            return res;
        }
        
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='+' || expression.charAt(i)=='-' || expression.charAt(i)=='*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for(int a : left){
                    for(int b : right){
                        if(expression.charAt(i)=='+'){
                            res.add(a+b);
                        }
                        else if(expression.charAt(i)=='-'){
                            res.add(a-b);
                        }
                        else if(expression.charAt(i)=='*'){
                            res.add(a*b);
                        }
                    }
                }

            }
        }

        return res;

    }
}
