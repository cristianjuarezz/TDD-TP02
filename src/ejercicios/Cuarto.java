package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Cuarto {

    public static int fibonacci(int n) {
        Integer salida = 0;

        if(n == 0) return 0;

        if(n == 1) return 0;

        if(n >= 1000000) return 0;

        Integer[] sucesion = sucesionHastaN(n);

        for (Integer i: sucesion) {
            if(esPar(i)) salida += i;
        }

        return salida;
    }

    public static Integer[] sucesionHastaN(Integer n) {
        Integer[] fibo = new Integer[n];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

    private static boolean esPar(Integer i) { return i % 2 == 0; }
}