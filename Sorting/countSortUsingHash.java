public static void countSortHash(int[] arr){
        if(arr==null || arr.length<=1){
            return;
        }
        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();
        Map<Integer,Integer> countmap=new HashMap<>();
        for(int num:arr){
            countmap.put(num,countmap.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int i=min;i<=max;i++){
            int count=countmap.getOrDefault(i,0);
            for(int j=0;j<count;j++){
                arr[index++]=i;
            }
        }
    }
