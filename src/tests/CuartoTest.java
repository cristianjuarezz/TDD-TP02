package tests;

import ejercicios.Cuarto;
import org.junit.Assert;
import org.junit.Test;

/*
Cada nuevo término de la secuencia de Fibonacci se genera sumando los dos términos anteriores.
Empezando por 1 y 1, los primeros 10 términos serán:

1, 1, 2, 3, 5, 8, 13, 21, 34, 55,…
2+8+34 = 44

Considerando los términos de la sucesión de Fibonacci cuyos valores no superan los cuatro
millones, halle la suma de los términos de valor par.
 */
public class CuartoTest {

    @Test
    public void sucesionHasta10(){
        Integer[] fibo = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        Assert.assertEquals(fibo, Cuarto.sucesionHastaN(10));
    }

    @Test
    public void entradaEs0(){
        Assert.assertEquals(0, Cuarto.fibonacci(0));
    }

    @Test
    public void entradaEs1(){
        Assert.assertEquals(0, Cuarto.fibonacci(1));
    }

    @Test
    public void entradaEs2(){
        Assert.assertEquals(0, Cuarto.fibonacci(2));
    }

    @Test
    public void entradaEs3(){
        Assert.assertEquals(2, Cuarto.fibonacci(3));
    }

    @Test
    public void entradaEs4(){
        Assert.assertEquals(2, Cuarto.fibonacci(4));
    }

    @Test
    public void entradaEs10(){
        Assert.assertEquals(44, Cuarto.fibonacci(10));
    }

    @Test
    public void entradaEs600(){
        Assert.assertEquals(1455448, Cuarto.fibonacci(600));
    }

    @Test
    public void entradaEs1Millon(){
        Assert.assertEquals(0, Cuarto.fibonacci(1000000));
    }
}