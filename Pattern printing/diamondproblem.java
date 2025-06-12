private static void zohodiamond(int n){
        int counter=0;
        int val=n;
        int sp;
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                sp=n-i;
            }else{
                sp=i-n-1;
            }
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            if(i<=n){
                counter+=i;
                for(int j=0;j<i;j++){
                    System.out.print(counter-j+" ");
                }
            }else{
                for(int j=0;j<val;j++){
                    System.out.print(counter-j+" ");
                }
                counter-=val;
                val--;
            }
            System.out.println();

        }
    }
