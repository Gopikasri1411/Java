class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            adj.get(u).add(new ArrayList<>(Arrays.asList(v,w)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u,w)));
        }
        
        PriorityQueue<Node> pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        pq.add(new Node(0,src));
        while(pq.size()!=0){
            int distance=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++){
                int edgewt=adj.get(node).get(i).get(1);
                int adjnode=adj.get(node).get(i).get(0);
                if(edgewt+distance<dist[adjnode]){
                    dist[adjnode]=edgewt+distance;
                    pq.add(new Node(dist[adjnode],adjnode));
                }
            }
            
        }
        return dist;
    }
    class Node{
        int distance;
        int node;
        Node(int distance,int node){
            this.distance=distance;
            this.node=node;
        }
    }
}
