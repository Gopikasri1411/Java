public int totalNumbers(int[] digits) {
        helper(digits,"");
        return set.size();
    }
    HashSet<String> set=new HashSet<>();
    void helper(int[] digits,String str){
        if(str.startsWith("0")){
            return;
        }

        if(str.length()==3 && (((int)(str.charAt(str.length()-1)))%2==0)){
            set.add(str);
            return;
        }
        if(str.length()==3 && ((int)(str.charAt(str.length()-1)))%2!=0){
            return;
        }
        for(int i=0;i<digits.length;i++){
            int[] temp=func(digits,i);
            helper(temp,str+digits[i]);
        }
    }
    int[] func(int[] digits,int num){
            int[] arr=new int[digits.length-1];
            int c=0;
            for(int i=0;i<digits.length;i++){
                if(i!=num){
                    arr[c]=digits[i];
                    c++;
                }
            }
            return arr;
        }
