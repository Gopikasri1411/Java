private static void snakepattern(int n) {
        int counter=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=n;j++){
                    System.out.print(++counter+" ");
                }
            }else{
                for(int j=0;j<n;j++){
                    System.out.print(counter--+" ");
                }
            }
            counter+=n;
            System.out.println();
        }
    }
