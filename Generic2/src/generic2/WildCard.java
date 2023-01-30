
package generic2;

public class WildCard <T extends Number>{
    private T sayi;

    public WildCard(T sayi) {
        this.sayi = sayi;
    }

    public T getSayi() {
        return sayi;
    }

    public void setSayi(T sayi) {
        this.sayi = sayi;
    }
    
}
