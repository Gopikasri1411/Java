public static void spiralpattern(int n){
        int[][] arr=new int[n][n];
        int i=0,j=0;
        char c='r';
        int counter=1;
        int startvalue=0,endvalue=n-1;
        for(int it=0;it<n*n;it++){
            if(c=='r'){
                arr[i][j]=counter;
                j++;
                if(j==endvalue+1){
                    c='d';
                    j--;
                }
            }else if(c=='d'){
                i++;
                arr[i][j]=counter;
                if(i==endvalue){
                    c='l';
                }
            }else if(c=='l'){
                j--;
                arr[i][j]=counter;
                if(j==startvalue){
                    c='u';
                    startvalue++;
                }
            }else if(c=='u'){
                i--;
                arr[i][j]=counter;
                if(i==startvalue){
                    c='r';
                    endvalue--;
                    j++;
                }
            }
            counter++;
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
