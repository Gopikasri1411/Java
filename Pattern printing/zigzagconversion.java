private static void pattern1(String str, int rows) {
       int[] arr=new int[str.length()];
       int val=0;
       boolean down=true;
       for(int i=0;i<str.length();i++){
           if(down==true&&val<rows){
               val+=1;
           }else if(val==rows){
               val-=1;
               down=false;
           }else if(down==false&& val>1){
               val-=1;
           }else{
               val+=1;
               down=true;
           }
           arr[i]=val;
       }
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<arr.length-1;i++){
           boolean already=true;
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]&&arr[i]!=0){
                   if(already){
                       sb.append(str.charAt(i));
                       already=false;
                   }
                   sb.append(str.charAt(j));
                   arr[j]=0;
               }else if(arr[i]!=arr[j]&&j==arr.length-1 && already){
                   sb.append(str.charAt(i));
               }
           }
       }
        System.out.println(sb);

    }

private static void pattern2(String str, int rows) {
        int[] arr=new int[str.length()];
        int val=0;
        boolean down=true;
        for(int i=0;i<str.length();i++){
            if(down==true&&val<rows){
                val+=1;
            }else if(val==rows){
                val-=1;
                down=false;
            }else if(down==false&& val>1){
                val-=1;
            }else{
                val+=1;
                down=true;
            }
            arr[i]=val;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0){
                sb.append(str.charAt(i));
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        sb.append(str.charAt(j));
                        arr[j]=0;
                    }
                }
            }

        }
        System.out.println(sb);

    }
