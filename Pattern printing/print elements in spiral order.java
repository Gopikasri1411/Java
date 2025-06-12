private static void printspiralorder(int[][] arr) {
        int i=0,j=0;
        char c='r';
        int startvalue=0,endvalue=arr[0].length-1;
        int endvalue2=arr.length;
        for(int it=0;it<arr.length*arr[0].length;it++){
            if(c=='r'){
                System.out.print(arr[i][j]+" ");
                j++;
                if(j==endvalue+1){
                    c='d';
                    j--;
                }
            }else if(c=='d'){
                i++;
                System.out.print(arr[i][j]+" ");
                if(i==endvalue2-1){
                    c='l';
                }
            }else if(c=='l'){
                j--;
                System.out.print(arr[i][j]+" ");
                if(j==startvalue){
                    c='u';
                    startvalue++;
                }
            }else if(c=='u'){
                i--;
                System.out.print(arr[i][j]+" ");
                if(i==startvalue){
                    c='r';
                    endvalue--;
                    endvalue2--;
                    j++;
                }
            }
        }
    }
