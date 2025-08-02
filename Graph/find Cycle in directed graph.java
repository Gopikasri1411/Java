class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        int[] vis=new int[V];
        int[] pathvis=new int[V];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
        }
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(i,adj,vis,pathvis)==true){
                    return true;
                }
            }
        }
        return false;
        
    }
    
    boolean dfs(int start,List<List<Integer>> adj,int[] vis,int[] pathvis){
        vis[start]=1;
        pathvis[start]=1;
        for(int it:adj.get(start)){
            if(vis[it]!=1){
                if(dfs(it,adj,vis,pathvis)){
                    return true;
                }
                
            }else if(pathvis[it]==1){
                return true;
            }
        }
        pathvis[start]=0;
        return false;
    }
}
