class Solution {
    public int numRookCaptures(char[][] board) {
        int ans = 0;

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    int up = i;
                    while(--up>=0){
                        if(board[up][j]=='B')
                            break;
                        if(board[up][j]=='p'){
                            ans++;
                            break;
                        }
                    }
                    int down = i;
                    while(++down<8){
                        if(board[down][j]=='B')
                            break;
                        if(board[down][j]=='p'){
                            ans++;
                            break;
                        }
                    }
                    int right = j;
                    while(++right<8){
                        if(board[i][right]=='B')
                            break;
                        if(board[i][right]=='p'){
                            ans++;
                            break;
                        }
                    }
                    int left = j;
                    while(--left>=0){
                        if(board[i][left]=='B')
                            break;
                        if(board[i][left]=='p'){
                            ans++;
                            break;
                        }
                    }
                }
            }
        }

        return ans;
    }
}

