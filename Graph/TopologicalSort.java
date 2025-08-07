public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int[] vis=new int[V];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i,vis,adj,stack);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }
    
    public static void dfs(int node,int[] vis,List<List<Integer>> adj,Stack<Integer> stack){
        vis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                dfs(it,vis,adj,stack);
            }
        }
        stack.push(node);
    }
