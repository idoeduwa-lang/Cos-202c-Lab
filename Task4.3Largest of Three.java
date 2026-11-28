//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 4
//Task 4.3: Largest of three. Read three integers and print the largest without using Math.max.

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: 9");
        int a = input.nextInt();
        System.out.print("Enter second number: 12");
        int b = input.nextInt();
        System.out.print("Enter third number: 14");
        int c = input.nextInt();

        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest is: " + largest);

        input.close();
    }
}