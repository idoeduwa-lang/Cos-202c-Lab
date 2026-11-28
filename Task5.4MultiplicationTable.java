//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 5
//Task 5.4: Multiplication table. Read a number and print its table from 1 to 12 in a neat layout.


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %2d = %d%n", num, i, num * i);
        }

        input.close();
    }
}