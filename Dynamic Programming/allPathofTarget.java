
//brute force
public list<list<String>> allconstruct(String target,int[] wordbreak){
  if(target==""){
    List<List<String>> res=new ArrayList<>():
      res.add(new ArrayList<>();
      return res;
  }

  List<List<String>> ans=new ArrayList<>();
  for(String word:wordbreak){
    if(target.startsWith(word)){
      String suff=target.subString(word.length());
      List<List<String>> ways=allconstruct(suff,wordbreak);
      for(List<String> way: ways){
        List<String> targetway=new ArrayList<>();
        targetway.add(word);
        targetway.addAll(way);
        ans.add(targetWay);
      }
    }
  }
  return ans;
}

//memoization

public list<list<String>> allconstruct(String target,int[] wordbreak,HashMap<String,List<List<Integer>> memo){
  if(memo.containsKey(target)){
    return memo.get(target);
  }
  if(target==""){
    List<List<String>> res=new ArrayList<>():
      res.add(new ArrayList<>();
      return res;
  }

  List<List<String>> ans=new ArrayList<>();
  for(String word:wordbreak){
    if(target.startsWith(word)){
      String suff=target.subString(word.length());
      List<List<String>> ways=allconstruct(suff,wordbreak);
      for(List<String> way: ways){
        List<String> targetway=new ArrayList<>();
        targetway.add(word);
        targetway.addAll(way);
        ans.add(targetWay);
      }
    }
  }
  memo.put(target,ans);
  return ans;
}


