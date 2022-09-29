package tests;

import ejercicios.Segundo;
import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class SegundoTest {
    @Test
    @Description("Un array vacio da 0")
    public void unArrayVacioDa0() {
        int[] arrayVacio = {};
        Assert.assertEquals(0, Segundo.resultado(arrayVacio));
    }

    @Test
    @Description("Un array con un elemento [0] da 0")
    public void unArrayConSolo0() {
        int[] arrayCon0 = {0};
        Assert.assertEquals(0, Segundo.resultado(arrayCon0));
    }

    @Test
    @Description("Un array con un elemento [1] da 1")
    public void unArrayConSolo1() {
        int[] arrayCon1 = { 1 };
        Assert.assertEquals(1, Segundo.resultado(arrayCon1));
    }

    @Test
    @Description("Un array con los elementos [0, 1] da 1")
    public void dosElementos() {
        int[] arrayDosElementos = { 0, 1 };
        Assert.assertEquals(1, Segundo.resultado(arrayDosElementos));
    }

    @Test
    @Description("Un array con los elementos [0, 2] da 2")
    public void dosElementos2() {
        int[] arrayDosElementos = { 0, 2 };
        Assert.assertEquals(2, Segundo.resultado(arrayDosElementos));
    }

    @Test
    @Description("Un array con los elementos [2, 0] da 2")
    public void dosElementos3() {
        int[] arrayDosElementos = { 2, 0 };
        Assert.assertEquals(2, Segundo.resultado(arrayDosElementos));
    }

    @Test
    @Description("La un array con [1, 1, 1] da 3")
    public void tresElementos() {
        int[] arrayTresElementos = { 1, 1, 1 };
        Assert.assertEquals(3, Segundo.resultado(arrayTresElementos));
    }

    @Test
    @Description("La un array con [1, 2, 3] da 6")
    public void tresElementos2() {
        int[] arrayTresElementos = { 1, 2, 3 };
        Assert.assertEquals(6, Segundo.resultado(arrayTresElementos));
    }

    @Test
    @Description("La un array con [3, 2, 1] da 6")
    public void tresElementos3() {
        int[] arrayTresElementos = { 3, 2, 1 };
        Assert.assertEquals(6, Segundo.resultado(arrayTresElementos));
    }
}
