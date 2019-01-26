import java.math.BigInteger;

public class Main {



    static Algotithms algotithms =new Algotithms();




    public static void main(String[] args) {

        BigInteger a=new BigInteger("31");
        BigInteger b=new BigInteger("79");
        BigInteger c=algotithms.ModInverse(b,a);
        System.out.println(c);
    }
}
