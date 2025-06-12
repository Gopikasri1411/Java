static void pattern31(int n) {
        int originaln=n;
        n=2*n;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int everyindex=originaln-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(everyindex+1+" ");
            }
            System.out.println();

        }
    }
