private static void pattern2(int n) {
        int index=0;
        int[] arr=new int[n*n];
        int[] arr2=new int[n*n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[index]=i+j;
                arr2[index]=index+1;
                index++;
            }
        }
        Arrays.sort(arr);
        int val=0;
        int itr=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==val){
                    System.out.print(arr2[j]+" ");
                    arr[j]=0;
                    itr++;
                    val++;
                }
                if(itr==n){
                    val=i+1;
                    itr=0;
                    break;
                }
            }
            System.out.println();

        }
    }
