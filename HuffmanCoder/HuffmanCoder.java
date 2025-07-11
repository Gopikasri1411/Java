import java.lang.classfile.instruction.CharacterRange;
import java.util.*;
public class HuffmanCoder {
    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;
    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;
        public Node(Character data,int cost){
            this.data=data;
            this.cost=cost;
            this.left=null;
            this.right=null;
        }
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }
    public HuffmanCoder(String feeder) throws Exception{
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<feeder.length();i++){
            char ch=feeder.charAt(i);
            if(map.containsKey(ch)){
                int v=map.get(ch);
                v+=1;
                map.put(ch,v);
            }else{
                map.put(ch,1);
            }
        }
        Heaps<Node> minheap=new Heaps<>();
        Set<Map.Entry<Character,Integer>> entrySet =map.entrySet();
        for(Map.Entry<Character,Integer> entry:entrySet){
            Node node=new Node(entry.getKey(),entry.getValue());
            minheap.insert(node);
        }
        while(minheap.size()!=1){
            Node first=minheap.remove();
            Node second=minheap.remove();
            Node newNode=new Node('\0',first.cost+second.cost);
            newNode.left=first;
            newNode.right=second;
            minheap.insert(newNode);
        }
        Node ft=minheap.remove();
        this.encoder=new HashMap<>();
        this.decoder=new HashMap<>();
        this.initEncoderDecoder(ft,"");
    }
    private void initEncoderDecoder(Node node,String s){
        if(node==null){
            return;
        }
        if(node.left==null &&node.right==null){
            this.encoder.put(node.data,s);
            this.decoder.put(s,node.data);
        }
        initEncoderDecoder(node.left,s+"0");
        initEncoderDecoder(node.right,s+"1");
    }
    public String encode(String source){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<source.length();i++){
            sb.append(encoder.get(source.charAt(i)));
        }
        return sb.toString();
    }
    public String decode(String codesource){
        StringBuilder key=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<codesource.length();i++){
            key.append(codesource.charAt(i));
            if(decoder.containsKey(key.toString())){
                ans.append(decoder.get(key.toString()));
                key.setLength(0);
            }
        }
        return ans.toString();
    }
}
