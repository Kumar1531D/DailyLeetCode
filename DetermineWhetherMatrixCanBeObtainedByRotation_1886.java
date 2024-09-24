public boolean findRotation(int[][] mat, int[][] target) {
        int d0 = 0;
        int d90 = 0;
        int d180 = 0;
        int d270 = 0;

         int n = mat.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==target[i][j])
                    d0++;
                if(mat[i][j]==target[j][n-(i+1)])
                    d90++;
                if(mat[i][j]==target[n-(i+1)][n-(j+1)])
                    d180++;
                if(mat[i][j]==target[n-(j+1)][i])
                    d270++;
            }
        }

        if(d0==n*n || d90==n*n || d180==n*n || d270==n*n)
            return true;

        return false;
    }
