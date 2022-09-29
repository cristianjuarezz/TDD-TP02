package ejercicios;

public class Tercero {
    public static int resultado(Integer[] array) {
        Integer mayor = 0;

        if(array[0] == array[1] && array[0] == array[2]){
            mayor = array[0];
        }

        if(array[0] > array[1]){
            mayor = array[0];
        }

        if(array[1] > array[0]){
            mayor = array[1];
        }

        if(array[2] > array[1]){
            mayor = array[2];
        }

        return mayor;
    }
}