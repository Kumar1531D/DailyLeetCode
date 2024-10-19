class Solution {
    int count  = 0;
    public int numMagicSquaresInside(int[][] grid) {
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[i].length-2;j++){
                helper(grid,i,j);
            }
        }

        return count;
    }

    public void helper(int grid[][],int row,int col){
        int rowSum[] = new int[3];
        int colSum[] = new int[3];
        int equalDiagonal = 0;
        int otherDiagonal = 0;

        boolean check[] = new boolean[9];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(grid[row+i][col+j]>=10 ||grid[row+i][col+j]==0|| check[grid[row+i][col+j]-1])
                    return;
                check[grid[row+i][col+j]-1] = true;
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                rowSum[i]+=grid[row+i][col+j];
                colSum[j]+=grid[row+i][col+j];
                if(i==j)
                    equalDiagonal+=grid[row+i][col+j];
                if(i+j==2)
                    otherDiagonal+=grid[row+i][col+j];
            }
            if(rowSum[i]!=15 )
                return;
        }
        

        if(colSum[0]!=15 || colSum[1]!=15 || colSum[2]!=15 || equalDiagonal!=15 || otherDiagonal!=15)
            return;
        
        count++;

    }
}
