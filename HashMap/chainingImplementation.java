import java.util.*;
public class HashmapFinal<K,V>{
    ArrayList<LinkedList<Entity>> list;
    private int size=0;
    private float lf=0.5f;
    public HashmapFinal(){
        list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new LinkedList<>());
        }
    }
    public void put(K key,V value){
        int hash=Math.abs(key.hashCode()%list.size());
        LinkedList<Entity> entities=list.get(hash);
        for(Entity entity:entities){
            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }
        if((float)(size)/list.size()>lf){
            reHash();
        }
        entities.add(new Entity(key,value));
        size++;
    }
    private void reHash(){
        System.out.println("we are now rehashing");
        ArrayList<LinkedList<Entity>> old=list;
        list=new ArrayList<>();
        size=0;
        for(int i=0;i<old.size()*2;i++){
            list.add(new LinkedList<>());
        }
        for(LinkedList<Entity> entries: old){
            for(Entity entry:entries){
                put(entry.key,entry.value);
            }
        }
    }
    public V get(K key){
        int hash=Math.abs(key.hashCode()%list.size());
        LinkedList<Entity> entries=list.get(hash);
        for(Entity entry:entries){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }

    public V remove(K key){
        int hash=Math.abs(key.hashCode()%list.size());
        LinkedList<Entity> entities=list.get(hash);
        Entity target=null;
        for(Entity entry:entities){
            if(entry.key.equals(key)){
                target=entry;
                break;

            }
        }
        if(target!=null){
            entities.remove(target);
            size--;
            return target.value;
        }
        return null;

    }
    public boolean containKey(K key){
        return get(key)!=null;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append('{');
        for(LinkedList<Entity> entities:list){
            for(Entity entry:entities){
                sb.append(entry.key);
                sb.append(" = ");
                sb.append(entry.value);
                sb.append(',');
            }
        }
        sb.append('}');
        return sb.toString();
    }
    private class Entity{
        K key;
        V value;
        public Entity(K key,V value){
            this.key=key;
            this.value=value;
        }
    }
}
class Main2{
    public static void main(String[] args) {
        HashmapFinal<String,Integer> map=new HashmapFinal<>();
        map.put("gopika",95);
        map.put("brindha",98);
        map.put("praveena",96);
        map.put("donisha",95);
        System.out.println(map);

    }
}
