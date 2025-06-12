static void outerdiamond(int n) {
        for(int i=1;i<=2*n-1;i++){
            int totalcols=i<=n?i:n-i%n;
            int spaces=n-totalcols;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalcols;j++){
                if(j==1||j==totalcols){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
