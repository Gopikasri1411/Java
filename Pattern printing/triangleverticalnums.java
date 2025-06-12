private static void pattern1ton(int n) {
        int count=n-1;
        int var=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j!=1){
                    var+=count;
                    System.out.print(var+" ");
                    count--;
                }else{
                    System.out.print(i+" ");
                    var+=i;
                }
            }
            var=0;
            count=n-1;
            System.out.println();
        }
    }
