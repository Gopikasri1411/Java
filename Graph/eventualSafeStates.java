class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        int[] vis=new int[V];
        int[] pathvis=new int[V];
        int[] check=new int[V];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            List<Integer> neighbors=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++){
                neighbors.add(graph[i][j]);
            }
            adj.add(neighbors);

        }
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,adj,vis,pathvis,check);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<check.length;i++){
            if(check[i]==1){
                ans.add(i);
            }
        }
        return ans;

    }

    public boolean dfs(int node,List<List<Integer>> adj,int[] vis,int[] pathvis,int[] check){
        vis[node]=1;
        pathvis[node]=1;
        check[node]=0;
        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,adj,vis,pathvis,check)){
                    return true;
                }
            }else if(pathvis[it]==1){
                return true;
            }
        }
        pathvis[node]=0;
        check[node]=1;
        return false;
    }
}
