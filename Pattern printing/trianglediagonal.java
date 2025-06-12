private static void pattern_3(int n) {
        int size=(n*(n+1))/2;
        int[] arr=new int[size];
        int[] row=new int[size];
        int count=1;
        int prev=count;
        for(int c=0;c<size;c++){
            arr[c]=c+1;
            row[c]=count;
            if(count==n) {
                count = prev + 1;
                prev = count;
            }else {
                count++;
            }
        }
        count=1;
        for(int i=n;i>0;i--){
            for(int j=size;j>0;j--){
                if(row[j-1]==count){
                    System.out.print(arr[j-1]+" ");
                }
                if(j==1){
                    count++;
                }
            }
            System.out.println();
        }
    }
