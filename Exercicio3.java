
import java.util.HashMap;

public class Exercicio3 {
    // Recursivo puro
    public static long fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    // Programação dinâmica com memoization
    static HashMap<Integer, Long> fibCache = new HashMap<>();
    public static long fibPD(int n) {
        if (n <= 1) return n;
        if (fibCache.containsKey(n)) return fibCache.get(n);
        long result = fibPD(n - 1) + fibPD(n - 2);
        fibCache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 40;
        long inicio = System.currentTimeMillis();
        System.out.println("Fib Recursivo de " + n + ": " + fibRec(n));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo Recursivo: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        System.out.println("Fib PD de " + n + ": " + fibPD(n));
        fim = System.currentTimeMillis();
        System.out.println("Tempo PD: " + (fim - inicio) + "ms");
    }
}
