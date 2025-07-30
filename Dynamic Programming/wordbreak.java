
//brute force approach
public boolean wordBreak(String s, List<String> wordDict) {
        if(s==""){
            return true;
        }
        for(int i=0;i<wordDict.size();i++){
            if(s.length()>=wordDict.get(i).length() && wordDict.get(i).equals(s.substring(0,wordDict.get(i).length()))){
                if(wordBreak(s.substring(wordDict.get(i).length(),s.length()),wordDict)){
                    return true;
                }
            }
        }
        return false;
    }
//optimized one: memoization
HashMap<String,Boolean> map=new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s==""){
            return true;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        for(int i=0;i<wordDict.size();i++){
            if(s.length()>=wordDict.get(i).length() && wordDict.get(i).equals(s.substring(0,wordDict.get(i).length()))){
                if(wordBreak(s.substring(wordDict.get(i).length(),s.length()),wordDict)){
                    map.put(s,true);
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }
