class Solution {
    public int minDistance(String word1, String word2) {
        int memo[][] = new int[word1.length()][word2.length()];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return findMin(word1,word2,0,0,memo);
    }

    public int findMin(String word1,String word2,int i,int j,int memo[][]){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        if (word1.charAt(i) == word2.charAt(j)) {
            memo[i][j] = findMin(word1, word2, i + 1, j + 1, memo);
        }
        else{
            int insert = 1 + findMin(word1,word2,i,j+1, memo);
            int delete = 1 + findMin(word1,word2,i+1,j, memo);
            int replace = 1 + findMin(word1,word2,i+1,j+1, memo);

            memo[i][j] = Math.min(insert, Math.min(delete, replace));
        }

        return memo[i][j];
        
    }
}
