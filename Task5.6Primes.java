//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 5
//Task 5.6: Primes. Print all prime numbers between 1 and 100.

public class Primes {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}