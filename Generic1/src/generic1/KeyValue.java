
package generic1;


public class KeyValue <K, V>{
   
    private K key;
    private V value;
  
    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }
  
    public K getKey() {
        return key;
    }
  
    public V getValue() {
        return value;
    }
  
    void displayInfo() {
        System.out.println("Type of K " + key.getClass().getName());
        System.out.println("Type of V " + value.getClass().getName());
    }
}
    

