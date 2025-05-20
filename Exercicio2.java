
import java.util.HashMap;

public class Exercicio2 {
    // Top-down com memoization
    static HashMap<Integer, Long> memo = new HashMap<>();
    public static long fatorialTopDown(int n) {
        if (n <= 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        long result = n * fatorialTopDown(n - 1);
        memo.put(n, result);
        return result;
    }

    // Bottom-up
    public static long fatorialBottomUp(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] entradas = {3, 7};
        for (int n : entradas) {
            System.out.println("Top-Down: Fatorial de " + n + ": " + fatorialTopDown(n));
            System.out.println("Bottom-Up: Fatorial de " + n + ": " + fatorialBottomUp(n));
        }
    }
}
