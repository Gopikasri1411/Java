private static void rightwithinvert(int n) {
        for(int i=1;i<=n*2-1;i++){
            int totalcol=i>n?totalcol=n-(i%n):i;
            for(int j=1;j<=totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
