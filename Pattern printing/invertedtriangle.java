static void rightinvertedtri(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){   //for(j=1;j<=n-i+1;j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
