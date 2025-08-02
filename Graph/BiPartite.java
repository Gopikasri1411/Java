//bfs
class Solution {
    public boolean isBipartite(int V, int[][] edges) {
    int[] colors = new int[V];
    Arrays.fill(colors, -1);

    // Build adjacency list
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
    for (int[] edge : edges) {
        int u = edge[0], v = edge[1];
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected
    }

    for (int i = 0; i < V; i++) {
        if (colors[i] == -1) {
            if (!check(i, adj, colors)) return false;
        }
    }
    return true;
}

boolean check(int start, List<List<Integer>> adj, int[] color) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    color[start] = 0;

    while (!queue.isEmpty()) {
        int node = queue.poll();
        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == -1) {
                color[neighbor] = 1 - color[node];
                queue.add(neighbor);
            } else if (color[neighbor] == color[node]) {
                return false; // Conflict
            }
        }
    }
    return true;
}

}


//dfs
class Solution {
    public boolean isBipartite(int V, int[][] edges) {
    int[] colors = new int[V];
    Arrays.fill(colors, -1);

    // Build adjacency list
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
    for (int[] edge : edges) {
        int u = edge[0], v = edge[1];
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected
    }

    for (int i = 0; i < V; i++) {
        if (colors[i] == -1) {
            if (!check(i, 0,adj, colors)) return false;
        }
    }
    return true;
}

boolean check(int start, int colorprev,List<List<Integer>> adj, int[] color) {
    color[start]=1-colorprev;
    for(int i:adj.get(start)){
        if(color[i]==-1){
                if(!check(i,color[start],adj,color)){
                    return false;
                }
            }else{
                if(color[i]==color[start]){
                    return false;
                }
        }
    }
    return true;
    
}

}
