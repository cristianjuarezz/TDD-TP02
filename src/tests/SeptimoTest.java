package tests;

import ejercicios.SeptimoEjercicio;
import org.junit.Assert;
import org.junit.Test;

public class SeptimoTest {
    @Test
    public void el6EsUnNumeroPerfecto() {
        Assert.assertTrue(SeptimoEjercicio.esNumeroPerfecto(6));
    }

    @Test
    public void el28EsUnNumeroPerfecto() {
        Assert.assertTrue(SeptimoEjercicio.esNumeroPerfecto(28));
    }

    @Test
    public void el12EsNumeroAbundante() {
        Assert.assertTrue(SeptimoEjercicio.esNumeroAbundante(12));
    }

    @Test
    public void el18EsUnNumeroAbundante() {
        Assert.assertTrue(SeptimoEjercicio.esNumeroAbundante(18));
    }

    @Test
    public void el20EsUnNumeroAbundante() {
        Assert.assertTrue(SeptimoEjercicio.esNumeroAbundante(20));
    }

    @Test
    public void el24EsSumaDeNumerosAbundantes() {
        Assert.assertTrue(SeptimoEjercicio.esSumaDeNumerosAbundantes(24));
    }

    @Test
    public void el30EsSumaDeNumerosAbundantes() {
        Assert.assertTrue(SeptimoEjercicio.esSumaDeNumerosAbundantes(30));
    }

    @Test
    public void el40EsSumaDeNumerosAbundantes() {
        Assert.assertTrue(SeptimoEjercicio.esSumaDeNumerosAbundantes(40));
    }
}
