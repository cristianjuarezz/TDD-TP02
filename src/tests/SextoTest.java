package tests;

import ejercicios.SextoEjercicio;
import org.junit.Assert;
import org.junit.Test;

public class SextoTest {
    @Test
    public void elNumero2520esElMasChicoDivisiblePor1al10() {
        Assert.assertEquals(2520, SextoEjercicio.obtenerMasChicoDivisiblePorRango(1,10));
    }

    @Test
    public void elNumero232792560esElMasChicoDivisiblePor1al20() {
        Assert.assertEquals(232792560, SextoEjercicio.obtenerMasChicoDivisiblePorRango(1,20));
    }
}
