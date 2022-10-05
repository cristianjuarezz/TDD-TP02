package ejercicios;

public class SextoEjercicio {
    public static long obtenerMasChicoDivisiblePorRango(int desde, int hasta) {
        long numero = 0;
        boolean esDivisiblePorRango;
        do {
            esDivisiblePorRango = true;
            numero++;
            for(int i = desde; i <= hasta; i++) {
                if(numero % i != 0) esDivisiblePorRango = false;
            }
        }while(!esDivisiblePorRango);
        return numero;
    }
}
