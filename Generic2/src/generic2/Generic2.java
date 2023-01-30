
package generic2;

public class Generic2 {

    public static void main(String[] args) {
       WildCard<Double> double1=new WildCard<>(3.1);
       WildCard<Integer> integer=new WildCard<>(3);
       WildCard<Float> float1 =new WildCard<>(-2.1f);
        System.out.println(double1.getSayi());
        System.out.println(integer.getSayi());
    }
    
}
