package ejercicios;
import java.math.BigInteger;

interface Palindromo{
    boolean esPalindromo(BigInteger n);
}

public class EjercicioOcho {

    public static void main(String[] args){
        
    }

    public int sumaDePolindromoEnDecimalYBinarioHasta(int n) {
        int suma=0;
        for(int i=10;i<n;i++){
            String enBinario= deDecimalABinarioString(i);
            if(esPalindromo2(i) && esPalindromoString(enBinario)){
                suma+=i;
            }
        }
        return suma;
    }
    public boolean esPalindromo2(long num){
        long n = num;
        long rev = 0;
        while (n > 0){
            long r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return (num == rev);
    }

    }

}
