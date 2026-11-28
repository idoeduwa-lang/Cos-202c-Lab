//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 4
//Task 4.4: Calculator. Read two numbers and an operator (+ - * /). Use switch to compute the answer. Report an error for division by zero and for an unknown operator.

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter operator (+ - * /): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Answer: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Answer: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Answer: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                } else {
                    System.out.println("Answer: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Error: Unknown operator!");
                break;
        }

        input.close();
    }
}