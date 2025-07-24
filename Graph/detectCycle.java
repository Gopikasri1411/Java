public class Main {
    public static void main(String[] args) {
        MyGraph graph=new MyGraph(9);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.addEdge(3,6);
        graph.addEdge(2,5);
        graph.addEdge(5,8);
        graph.addEdge(6,7); '
        System.out.println(graph.detectcycle(9)); //output :false;
        // MyGraph graph=new MyGraph(8);
        // graph.addEdge(1,2);
        // graph.addEdge(1,3);
        // graph.addEdge(3,4);
        // graph.addEdge(3,6);
        // graph.addEdge(2,5);
        // graph.addEdge(5,7);
        // graph.addEdge(6,7);
        // System.out.println(graph.detectcycle(8)); output: true
    }
}
class MyGraph{
    ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    public MyGraph(int v){
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
    }
    public void display(){
        for(int i=0;i<list.size();i++){
            System.out.println("Elements in list:"+ i);
            for(int j=0;j<list.get(i).size();j++){
                System.out.println(list.get(i).get(j));
            }
        }
    }

    public void addEdge(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);

    }
    public boolean detectcycle(int v){
        boolean[] vis=new boolean[v+1];
        for(int i=0;i<list.size();i++){
            if(!vis[i]){
                if(helperToFindCycle(i,vis)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helperToFindCycle(int src, boolean[] vis) {
        vis[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();
            for(int adjacentnode: list.get(node)){
                if(!vis[adjacentnode]){
                    vis[adjacentnode]=true;
                    q.add(new Pair(adjacentnode,node));
                }else if(adjacentnode!=parent){
                    return true;
                }
            }
        }
        return false;
    }
}
class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
