private static void halfdiamond(int n) {
        int s=n-1;
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=n;j++){
                if(j<=s){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            if(i<n){
                s--;
            }else{
                s++;
            }
            System.out.println();
        }
    }
