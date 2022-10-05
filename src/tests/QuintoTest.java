package tests;

import ejercicios.Quinto;
import org.junit.Assert;
import org.junit.Test;

/*

5. Un número palindrómico se lee igual en ambos sentidos. El mayor palíndromo formado por el
producto de dos números de 2 cifras es 9009 = 91 × 99.

Encuentra el mayor palíndromo formado por el producto de dos números de 3 cifras.

*/

public class QuintoTest {

    @Test
    public void es111Palindromo() {
        Assert.assertEquals(true, Quinto.esPalindromo(111));
    }

    @Test
    public void esPalindromoSiTodosDigitosIguales() {
        Assert.assertEquals(true, Quinto.esPalindromo(2222));
        Assert.assertEquals(true, Quinto.esPalindromo(3333));
        Assert.assertEquals(true, Quinto.esPalindromo(4444));
        Assert.assertEquals(true, Quinto.esPalindromo(5555));
    }

    @Test
    public void es121Palindromo() {
        Assert.assertEquals(true, Quinto.esPalindromo(121));
    }

    @Test
    public void tiene121digitosIguales() {
        Assert.assertEquals(false, Quinto.todosDigitosIguales("121"));
    }

    @Test
    public void esPalindromoSiTieneUnDigito() {
        Assert.assertEquals(true, Quinto.esPalindromo(111));
    }

    @Test
    public void mayorPalindromoTresCifras(){
        Integer mayorPalindromo = 906609;
        Assert.assertEquals(mayorPalindromo, Quinto.mayorPalindromo());
    }
}