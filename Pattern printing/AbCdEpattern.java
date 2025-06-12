static void pattern3(int n){
        int var=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print((char)var+" ");
                    var++;
                }else{
                    int a=var+32;
                    System.out.print((char)a+" ");
                    var++;
                }
            }
            System.out.println();
        }
    }
