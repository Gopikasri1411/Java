static void outertriangle(int n) {
        for(int i=1;i<n;i++){
            int outerspace=n-i;
            for(int s=0;s<outerspace;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int k=0;k<2*n-1;k++){
            System.out.print("*");
        }
        System.out.println();

    }
