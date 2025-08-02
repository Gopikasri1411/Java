private static void permutation(String s) {
        helper("",s);
    }
    static void helper(String p,String up){
//        if(!p.isEmpty()){
//            System.out.println(p); this will print all permuations like A B C AB AC BA BC CA CB etc..
//        }
        if(p.length()==up.length()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<up.length();i++){
            if(!p.contains(up.charAt(i)+"")){
                helper(p+up.charAt(i),up);
            }
        }

    }
