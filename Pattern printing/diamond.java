static void diamond(int n) {
        for(int i=1;i<=n*2-1;i++){
            int totalcol=i>n?totalcol=n-(i%n):i;
            int numofspaces=i>=n?i-n:n-i;//numofspacces=n-totalcols
            for(int s=0;s<numofspaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
