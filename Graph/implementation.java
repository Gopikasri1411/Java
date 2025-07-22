import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyGraph graph=new MyGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.display();
        graph.bfs(0);
        graph.dfs(0);
        graph.dfsusingrecursion(4);
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

    public void bfs(int v) {
        Queue<Integer> queue=new LinkedList<>();
        boolean visisted[] =new boolean[list.size()];
        queue.add(v);
        visisted[v]=true;
        while(!queue.isEmpty()){
            int vertex=queue.remove();
            System.out.print(vertex+" ");
            for(int i=0;i<list.get(vertex).size();i++){
                int av=list.get(vertex).get(i);
                if(!visisted[av]){
                    queue.add(av);
                    visisted[av]=true;
                }
            }
        }
        System.out.println();
    }
    public void dfs(int v) {
        Stack<Integer> s=new Stack<>();
        boolean visisted[] =new boolean[list.size()];
        s.add(v);
        visisted[v]=true;
        while(!s.isEmpty()){
            int vertex=s.pop();
            System.out.print(vertex+" ");
            for(int i=0;i<list.get(vertex).size();i++){
                int av=list.get(vertex).get(i);
                if(!visisted[av]){
                    s.add(av);
                    visisted[av]=true;
                }
            }
        }
        System.out.println();
    }

    public void dfsusingrecursion(int V){
        boolean visited[] =new boolean[V+1];
        visited[0]=true;
        ArrayList<Integer> ls=new ArrayList<>();
        dfs(0,visited,ls);
        System.out.println(ls);
    }
    public void dfs(int node, boolean[] visited, ArrayList<Integer> ls){
        visited[node]=true;
        ls.add(node);
        for(Integer i:list.get(node)){
            if(!visited[i]){
                dfs(i,visited,ls);
            }
        }
    }
}
