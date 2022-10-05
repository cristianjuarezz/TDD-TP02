package ejercicios;
import java.math.BigInteger;

interface Palindromo{
    boolean esPalindromo(BigInteger n);
}

public class EjercicioOcho {

    public static void main(String[] args){
        Palindromo base10 = (n) ->{
            if(n.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0)
                return false;
            BigInteger cp = n;
            BigInteger rm;
            BigInteger res = BigInteger.ZERO;

            while (cp.compareTo(BigInteger.ZERO) != 0){
                rm = cp.mod(BigInteger.TEN);
                res = res.multiply(BigInteger.TEN).add(rm);
                cp = cp.divide(BigInteger.TEN);
            }
            return res.compareTo(n) == 0;
        };

        Palindromo base2 = (n) ->{
            String binary = Integer.toBinaryString(n.intValue());
            BigInteger integer = new BigInteger(binary);
            return base10.esPalindromo(integer);
        };

        BigInteger sum = BigInteger.ZERO;
        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(1000_000)) <0; i = i.add(BigInteger.ONE)){
            if (base10.esPalindromo(i) && base2.esPalindromo(i))
                sum = sum.add(i);
        }

        System.out.println(sum);

    }

}
