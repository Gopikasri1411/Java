// find shortes distance between src to all nodes using topo sort. 
class Solution {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<E;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        int[] vis=new int[V];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                topoSort(i,vis,stack,adj);
            }
        }
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=(int)(1e9);
        } 
        dist[0]=0;   //distance btwn vertex 0 to 0 is 0;
        while(!stack.isEmpty()){
            int node=stack.peek();
            stack.pop();
            for(int i=0;i<adj.get(node).size();i++){
                int v=adj.get(node).get(i).v;
                int wt=adj.get(node).get(i).wt; 
                if(dist[node]+wt<dist[v]){
                    dist[v]=dist[node]+wt;
                }
            }
        }
        for(int i=0;i<V;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
        
    }
    public void topoSort(int node,int[] vis,Stack<Integer> stack,ArrayList<ArrayList<Pair>> adj ){
        vis[node]=1;
        for(int i=0;i<adj.get(node).size();i++){
            int v=adj.get(node).get(i).v;
            if(vis[v]==0){
                topoSort(v,vis,stack,adj);
            }
        }
        stack.add(node);
    }
}
class Pair{
    int v;
    int wt;
    Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
}
