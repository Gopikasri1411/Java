public void rotateMatrixanticlock(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){  //transpose
            for(int j=i;j<n;j++){
                if(i!=j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            int row=m-1;
            for(int j=0;j<m/2;j++){
                int temp=mat[row][i]; // just swap the last index elements for every col
                mat[row][i]=mat[j][i];
                mat[j][i]=temp;
                row--;
            }
        }
        
    }


public void rotateclockwise(int[][] matrix) {
        helper(matrix);
    }
    void helper(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){  //transpose
            for(int j=i;j<n;j++){
                if(i!=j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            int col=n-1;
            for(int j=0;j<n/2;j++){
                int temp=mat[i][col]; // swap last elements for every row.
                mat[i][col]=mat[i][j];
                mat[i][j]=temp;
                col--;
            }
        }
    }
