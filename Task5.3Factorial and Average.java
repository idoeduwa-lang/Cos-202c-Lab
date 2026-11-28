//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 5
//Task 5.3: Factorial and powers. Read n and print n factorial. Then compute 2 to the power n using a loop, not Math.pow.

import java.util.Scanner;

public class FactorialAndPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);

        long power = 1;
        for (int i = 1; i <= n; i++) {
            power *= 2;
        }
        System.out.println("2^" + n + " = " + power);

        input.close();
    }
}