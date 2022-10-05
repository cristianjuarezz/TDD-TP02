
package tests;

import ejercicios.EjercicioOcho;
import org.junit.Assert;
import org.junit.Test;

public class OctavoTest {

    @Test
    public void polindromoEnBinarioYDecimalLaSuma(){
        Codigo q = new Codigo();
        
        long t= q.deDecimalABinario(5);
        long t1= q.deDecimalABinario(585);
        
        assertEquals(101,t);
        assertEquals(1001001001,t1);
        
        int s= q.sumaDePolindromoEnDecimalYBinarioHasta(100000);
        assertEquals(286577,s);
        
        int w= q.sumaDePolindromoEnDecimalYBinarioHasta(1000000);
        assertEquals(872162,w);
        
    }
}
