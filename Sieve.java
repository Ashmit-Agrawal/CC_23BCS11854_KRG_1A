public class Sieve {
    public static void main(String[] args) {
        int n = 36;
        int original = n;
        int highPrime = -1;
        while (n % 2 == 0) {
            highPrime = 2;
            n /= 2;
        }
        for (int i = 3; (long)i * i <= n; i += 2) {
            while (n % i == 0) {
                highPrime = i;
                n /= i;
            }
        }
        if (n > 1) highPrime = n;

        System.out.println("Highest Prime Factor of " + original + ": " + highPrime);
    }
}