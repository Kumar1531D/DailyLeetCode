class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(rec(board,word,0,i,j))
                        return true;
                }
            }
        }

        return false;
        
    }

    public boolean rec(char[][] board,String word,int wordIndex,int iIndex,int jIndex){
        if(iIndex<board.length && iIndex>=0 && jIndex<board[0].length && jIndex>=0 && wordIndex == word.length()-1 && board[iIndex][jIndex]==word.charAt(wordIndex)){
            return true;
        }
        
        if(iIndex>=board.length || iIndex<0 || jIndex>=board[0].length || jIndex<0 || wordIndex>=word.length() || board[iIndex][jIndex]!=word.charAt(wordIndex) || board[iIndex][jIndex]=='0'){
            return false;
        }
        char temp = board[iIndex][jIndex];
        board[iIndex][jIndex] = '0';
        boolean right = rec(board,word,wordIndex+1,iIndex,jIndex+1);
        boolean left = rec(board,word,wordIndex+1,iIndex,jIndex-1);
        boolean top = rec(board,word,wordIndex+1,iIndex-1,jIndex);
        boolean down = rec(board,word,wordIndex+1,iIndex+1,jIndex); 

        board[iIndex][jIndex] = temp;

        // for(int i=iIndex;i<board.length;i++){
        //     for(int j=jIndex;j<board[i].length;j++){
        //         if()
        //     }
        // }

        return right || left || top || down;


    }
}
