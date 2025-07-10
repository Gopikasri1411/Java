public static void countSort(int[] array){
        if(array==null || array.length<=1){
            return;
        }
        int max=array[0];
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        int[] countarray=new int[max+1];
        for(int num:array){
            countarray[num]++; //normal post increment
        }
        int index=0;
        for(int i=0;i<=max;i++){
             while(countarray[i]>0){
                 array[index++]=i;
                 countarray[i]--;
             }
        }
    }
