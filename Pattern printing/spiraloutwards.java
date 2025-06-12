private static void actualspiralprinting(int n) {
        int[][] arr=new int[n][n];
        int itr=1;
        int row,col;
        if(n%2==0){
            row=(n/2)-1;
            col=row;
        }else{
            row=n/2;
            col=row;
        }
        int colend=1;
        int rowend=1;
        int rowstart=2;
        int colstart=2;
        arr[row][col]=itr++;
        col++;
        while(true){
            for(int i=1;i<=colend && itr<=n*n;i++){
                arr[row][col]=itr;
                col++;
                itr++;
            }
            row++;
            col--;

            for(int i=1;i<=rowend && itr<=n*n;i++){
                arr[row][col]=itr;
                itr++;
                row++;
            }
            row--;
            col--;

            for(int i=1;i<=rowstart && itr<=n*n;i++){
                arr[row][col]=itr;
                itr++;
                col--;
            }
            col++;
            row--;

            for(int i=1;i<=colstart&& itr<=n*n;i++){
                arr[row][col]=itr;
                itr++;
                row--;
            }
            row++;
            colstart+=2;
            col++;
            rowend+=2;
            rowstart+=2;
            colend+=2;
            if(itr>n*n){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<10){
                    System.out.print(arr[i][j]+"  ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
