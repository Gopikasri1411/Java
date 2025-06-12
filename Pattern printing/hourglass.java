static void triangle2(int n) {
        for(int i=1;i<=2*n-1;i++){
            int totalcols=i<=n?n-i+1:i%n+1;
            int spaces=i<=n?i-1:n-totalcols;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalcols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
