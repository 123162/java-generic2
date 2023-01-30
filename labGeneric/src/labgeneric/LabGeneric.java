
package labgeneric;

public class LabGeneric {

    public static void main(String[] args) {
        Pair<String,Integer> p1=new OrderedPair("rabia",21);
        Pair<String,String> p2=new OrderedPair("GALPPP<AŞK>","oğuz");
        
        System.out.println(p1.getKey());
        
        System.out.println(p2.getKey());
        
        System.out.println(p2.getValue());
    }
    
}
