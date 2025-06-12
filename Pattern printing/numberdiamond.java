static void pattern30(int n) {
        for (int i = 1; i <=2*n; i++) {
            int sechalf=2*n-i;
            int spaces=i<=n?n-i:i%n;
            for(int s=0;s<spaces;s++){
                System.out.print("  ");
            }
            if(i<=n){
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j+" ");
                }
            }else{
                for(int j=sechalf;j>=1;j--){
                    System.out.print(j+" ");
                }
                for(int j=2;j<=sechalf;j++){
                    System.out.print(j+" ");
                }
            }

            System.out.println();

        }
    }
