
public class Exercicio1 {
    public static long fatorialRecursivo(int n) {
        if (n <= 1) return 1;
        return n * fatorialRecursivo(n - 1);
    }

    public static void main(String[] args) {
        int[] entradas = {3, 7};
        for (int n : entradas) {
            System.out.println("Fatorial de " + n + ": " + fatorialRecursivo(n));
        }
    }
}
