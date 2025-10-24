class Solution {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        int[] dist=new int[adj.size()];
        for(int i=0;i<dist.length;i++){
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        while(!queue.isEmpty()){
            int node=queue.remove();
            for(int it:adj.get(node)){
                if(dist[node]+1<dist[it]){
                    dist[it]=dist[node]+1;
                    queue.add(it);
                }
            }
            
        }
        for(int i=0;i<dist.length;i++){
            if(dist[i]==1e9){
                dist[i]=-1;
            }
        }
        return dist;
    }
}
