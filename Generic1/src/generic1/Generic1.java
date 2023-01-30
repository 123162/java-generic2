
package generic1;

public class Generic1 {

    public static void main(String[] args) {
        KeyValue<String, String> strKeyValuePair = new KeyValue<>("name", "Java");
        System.out.println(strKeyValuePair.getKey());
        System.out.println(strKeyValuePair.getValue());
      
        KeyValue<String, Integer> mixKeyValuePair = new KeyValue<>("age", 25);
        mixKeyValuePair.displayInfo();
    }
    
}
