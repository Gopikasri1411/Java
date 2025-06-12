private static void pattern(int n) {
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                // or we can also do something like, j-1%i+1 +" " just convert the condition of j as j=n j<j+n
                if(counter!=n){
                    System.out.print(counter%n+" ");
                }else{
                    System.out.print(counter+" ");
                }
                counter++;
            }
            counter=i+1;
            System.out.println();
        }
    }
