static void perfecttrianlge(int n) {
        int extra=0;
        for(int i=1;i<=n;i++){
            int totalspaces=n-i;
            for(int s=0;s<totalspaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+extra;j++){
                System.out.print("*");
            }
            System.out.println();
            extra++;
        }
    }
