
package tests;

import ejercicios.NovenoEjercicio;
import ejercicios.PrimerEjercicio;
import org.junit.Assert;
import org.junit.Test;

public class NovenoTest {




    @Test
    public void esPrimo(){
        int nro = 71;
        Assert.assertTrue(NovenoEjercicio.isPrime(nro));
    }





}
