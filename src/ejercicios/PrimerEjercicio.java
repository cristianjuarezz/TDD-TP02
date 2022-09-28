package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimerEjercicio {
    static ArrayList<Integer> multiplosDe5 = new ArrayList<Integer>(Arrays.asList(5,10,15,20));
    static ArrayList<Integer> multiplosDe3 = new ArrayList<Integer>(Arrays.asList(3,6,9,12));

    public static int sumatoriaMultiplos(int n) { // 3, 5, 6, 9 - 10
        int sumatoria = 0;

        for(Integer i = 1; i < n; i++){
            if(esMultiploDe5(i) || esMultiploDe3(i)){
                sumatoria += i;
                System.out.println("SE SUMO: " + i);
            }
        }
        System.out.println("SUMATORIA: " + sumatoria);

        return sumatoria;
    }

    private static boolean esMultiploDe5(Integer i) {
        return multiplosDe5.contains(i);
    }
    private static boolean esMultiploDe3(Integer i) {
        return multiplosDe3.contains(i);
    }
}
