package ejercicios;


public class NovenoEjercicio {

    public static void main(String[] args) {
        System.out.println(new NovenoEjercicio().run());
    }


    private static final int TARGET = 5000;

    public String run() {
        for (int limit = 1; ; limit *= 2) {
            int result = search(limit, TARGET);
            if (result != -1)
                return Integer.toString(result);
        }
    }

    public static long sqrt(long x) {
        if (x < 0)
            throw new IllegalArgumentException("Raíz cuadrada de un número negativo");
        long y = 0;
        for (long i = 1L << 31; i != 0; i >>>= 1) {
            y |= i;
            if (y > 3037000499L || y * y > x)
                y ^= i;
        }
        return y;
    }

    public static boolean isPrime(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Numero negativo");
        if (x == 0 || x == 1)
            return false;
        else if (x == 2)
            return true;
        else {
            if (x % 2 == 0)
                return false;
            for (int i = 3, end = (int) sqrt(x); i <= end; i += 2) {
                if (x % i == 0)
                    return false;
            }
            return true;
        }
    }


    private static int search(int limit, int target) {
        int[] partitions = new int[limit];
        partitions[0] = 1;
        for (int i = 0; i < partitions.length; i++) {
            if (!NovenoEjercicio.isPrime(i))
                continue;
            for (int j = i; j < partitions.length; j++)
                partitions[j] += partitions[j - i];
        }
        for (int i = 0; i < limit; i++) {
            if (partitions[i] > target)
                return i;
        }
        return -1;
    }

}
