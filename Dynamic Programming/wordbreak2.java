//brute force
public int wordBreak(String s, List<String> wordDict) {
        if(s==""){
            return 1;
        }
        int count=0;
        for(int i=0;i<wordDict.size();i++){
            if(s.length()>=wordDict.get(i).length() && wordDict.get(i).equals(s.substring(0,wordDict.get(i).length()))){
                count+=wordBreak(s.substring(wordDict.get(i).length(),s.length()),wordDict);
            }
        }
        return count;
    }
