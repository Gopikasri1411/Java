static void trianglewithspaces(int n) {
        for(int i=1;i<=n;i++){
            int totalspaces=n-i;
            for (int s = 0; s < totalspaces; s++) {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
