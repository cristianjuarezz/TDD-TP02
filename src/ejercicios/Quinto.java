package ejercicios;

public class Quinto {

    public static Integer mayorPalindromo(){
        Integer mayorPalindromoResultante = 0;

        for (int x = 100; x < 1000; x++) {
            for (int y = 100; y < 1000; y++) {
                Integer producto = x * y;

                if(esPalindromo(producto) && producto > mayorPalindromoResultante)
                    mayorPalindromoResultante = producto;
            }
        }

        return mayorPalindromoResultante;
    }

    public static boolean esPalindromo(int i) {
        String numeroComoString = Integer.toString(i);

        if(numeroComoString.length() == 1){
            return true;
        }
        if(todosDigitosIguales(numeroComoString)){
            return true;
        }
        if(numeroComoString.equals(stringInverso(numeroComoString))){
            return true;
        }

        return false;
    }

    public static String stringInverso(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static boolean todosDigitosIguales(String numeroComoString) {
        int n = numeroComoString.length();

        for (int i = 1; i < n; i++) {
            if (numeroComoString.charAt(i) != numeroComoString.charAt(0)) return false;
        }

        return true;
    }
}