private static void rightwithinvert(int n) {
        for(int i=1;i<n*2;i++){
            if(i<=5){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }else{
                for(int j=1;j<=n-(i-n);j++){ // refer notes how we get it
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
