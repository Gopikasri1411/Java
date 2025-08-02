public void rotateMatrix(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
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
                int temp=mat[row][i];
                mat[row][i]=mat[j][i];
                mat[j][i]=temp;
                row--;
            }
        }
        
    }
