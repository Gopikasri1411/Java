class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]=new boolean[isConnected.length+1];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(!visited[i]){
                count++;
                helper(i,visited,list);
            }
        }
        return count;
    }
    void helper(int st,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[st]=true;
        for(Integer i: adj.get(st)){
            if(!vis[i]){
                helper(i,vis,adj);
            }
        }
        
    }
}
