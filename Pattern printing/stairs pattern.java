private static void invertedtriangle(int n) {
        for(int i=1;i<=n;i++){
            int sp=i-1;
            for(int s=0;s<sp;s++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
