package tests;

import ejercicios.Tercero;
import org.junit.Assert;
import org.junit.Test;

public class TerceroTest {

    @Test
    public void mayorEs6(){
        Integer[] array = {1,3,6};
        Assert.assertEquals(Tercero.resultado(array), 6);
    }

    @Test
    public void mayorEs74(){
        Integer[] array = {74,24,12};
        Assert.assertEquals(Tercero.resultado(array), 74);
    }

    @Test
    public void mayorEs53(){
        Integer[] array = {32,1,53};
        Assert.assertEquals(Tercero.resultado(array), 53);
    }

    @Test
    public void mayorEs1(){
        Integer[] array = {1,1,1};
        Assert.assertEquals(Tercero.resultado(array), 1);
    }

    @Test
    public void mayorEs1Negativo(){
        Integer[] array = {-1,-2,-3};
        Assert.assertEquals(Tercero.resultado(array), -1);
    }

    @Test
    public void mayorEs1NegativoTambien(){
        Integer[] array = {-3,-2,-1};
        Assert.assertEquals(Tercero.resultado(array), -1);
    }
}