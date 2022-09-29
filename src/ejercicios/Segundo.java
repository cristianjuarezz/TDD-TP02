package ejercicios;

public class Segundo {

    public static int resultado(int[] array) {
        Integer sumatoria = 0;
        for (Integer i: array) {
            sumatoria += i;
        }
        return sumatoria;
    }
}
