public class Hashmap {
    private Entity[] entities;
    public Hashmap(){
        entities=new Entity[100];
    }
    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key,value); //overriding no chaining
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash]=null; //simple but not optimized
        }
    }
    private class Entity{
        String key;
        String value;
        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }
}
class Main1{
    public static void main(String[] args) {
        Hashmap map=new Hashmap();
        map.put("gopika","95");
        map.put("brindha","98");
        map.put("praveena","96");
        map.put("donisha","95");
    }
}
