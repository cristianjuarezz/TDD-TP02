package ejercicios;

public class Primero {


    public static int sumatoriaMultiplos(int n) { // 3, 5, 6, 9 - 10
        int sumatoria = 0;

        for(Integer i = 1; i < n; i++){
            if(esMultiploDe5(i) || esMultiploDe3(i)) sumatoria += i;
        }

        return sumatoria;
    }

    private static boolean esMultiploDe5(Integer i) {
        return i % 5 == 0;
    }
    private static boolean esMultiploDe3(Integer i) {
        return i % 3 == 0;
    }
}
