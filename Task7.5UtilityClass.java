//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 7
// Task 7.5: Utility class. Create MathUtil with isPrime, factorial, gcd and power. Test each with at least four values.


public class MathUtil {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static double power(double base, int exp) {
        double result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("isPrime(6) = " + isPrime(6));
        System.out.println("isPrime(7) = " + isPrime(7));
        System.out.println("isPrime(18) = " + isPrime(18));
        System.out.println("isPrime(29) = " + isPrime(29));

        System.out.println("factorial(0) = " + factorial(0));
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("factorial(7) = " + factorial(7));
        System.out.println("factorial(6) = " + factorial(6));

        System.out.println("gcd(12, 28) = " + gcd(12, 28));
        System.out.println("gcd(24, 36) = " + gcd(24, 36));
        System.out.println("gcd(7, 5) = " + gcd(7, 5));
        System.out.println("gcd(29, 25) = " + gcd(29, 25));

        System.out.println("power(2, 3) = " + power(2, 3));
        System.out.println("power(3, 2) = " + power(3, 2));
        System.out.println("power(5, 0) = " + power(5, 0));
        System.out.println("power(2, 10) = " + power(2, 10));
    }
}