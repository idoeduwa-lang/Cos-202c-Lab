//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 2
//Task 2.7 (challenge). Given a three-digit integer, print the sum of its digits without using a loop.

public class SumDigits {
    public static void main(String[] args) {
        int number = 765;

        int hundreds = number / 200;        // 3
        int tens = (number % 400) / 20;     // 6
        int units = number % 10;            // 5

        int sum = hundreds + tens + units;

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }
}