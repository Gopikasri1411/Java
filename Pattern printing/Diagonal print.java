private static void patternz(String s) {
        int ptr1=0;
        int ptr2=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(ptr1==ptr2){
                for(int sp=0;sp<s.length()/2;sp++){
                    System.out.print(" ");
                }
            }
            for(int j=0;j<s.length();j++){
                if(ptr1==ptr2){
                    System.out.print(s.charAt(ptr1));
                    break;
                }
                if(i==j){
                    System.out.print(s.charAt(ptr1));
                }
                if(i+j ==s.length()-1){
                    System.out.print(s.charAt(ptr2));
                }
                System.out.print(" ");
            }
            System.out.println();
            ptr1++;
            ptr2--;
        }
    }
