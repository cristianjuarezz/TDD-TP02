package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class SeptimoEjercicio {

    public static boolean esNumeroPerfecto(int numero) {
        return Arrays.stream(divisoresDeNumero(numero)).sum() == numero;
    }

    public static boolean esNumeroAbundante(int numero) {
        return Arrays.stream(divisoresDeNumero(numero)).sum() > numero;
    }

    public static boolean esSumaDeNumerosAbundantes(int numero) {
        int sumaNumero = 1;
        int i = 0;
        int[] nrosAbundantes = new int[0];
        if(numero > 20161) sumaNumero = 0;
        else {
            nrosAbundantes = numerosAbuntantesHastaNumero(numero - 1);
            i = nrosAbundantes.length - 1;
        }

        while(sumaNumero != 0 && i >= 0) {
            sumaNumero = numero - nrosAbundantes[i];
            for (int j = i; j >= 0 && sumaNumero != 0; j--) {
                if(sumaNumero - nrosAbundantes[j] == 0) {
                    sumaNumero -= nrosAbundantes[j];
                }
            }
            i--;
        }
        return sumaNumero == 0;
    }
    private static int[] numerosAbuntantesHastaNumero(int numero) {
        ArrayList<Integer> numerosAbundantes = new ArrayList<>();
        for(int i = 12; i <= numero; i++) {
            if(esNumeroAbundante(i)) numerosAbundantes.add(i);
        }
        return numerosAbundantes.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int[] divisoresDeNumero(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();
        int hasta = numero / 2;
        for(int i = 1; i <= hasta; i++) {
            if(numero % i == 0) divisores.add(i);
        }
        return divisores.stream().mapToInt(Integer::intValue).toArray();
    }
}
