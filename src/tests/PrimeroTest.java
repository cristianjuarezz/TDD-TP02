
package tests;

import ejercicios.PrimerEjercicio;
import org.junit.Assert;
import org.junit.Test;

public class PrimeroTest {


    @Test
    public void sumaHasta10(){ // 3, 5, 6, 9 - 10
        Assert.assertEquals(PrimerEjercicio.sumatoriaMultiplos(10), 23);
    }

    @Test
    public void sumaHasta20(){ // 3, 5, 6, 9, 10, 12, 15, 18 - 20
        Assert.assertEquals(PrimerEjercicio.sumatoriaMultiplos(20), 78);
    }

    @Test
    public void sumaHasta300(){
        Assert.assertEquals(PrimerEjercicio.sumatoriaMultiplos(300), 20850);
    }

    @Test
    public void sumaHasta1000(){
        Assert.assertEquals(PrimerEjercicio.sumatoriaMultiplos(1000), 233168);
    }
}
