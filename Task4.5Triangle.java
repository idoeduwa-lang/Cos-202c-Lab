//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 4
//Task 4.5: Triangle. Read three side lengths. Decide whether they form a triangle (each side less than the sum of the other two), and if so say whether it is equilateral, isosceles or scalene.


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = input.nextDouble();
        System.out.print("Enter side 2: ");
        double b = input.nextDouble();
        System.out.print("Enter side 3: ");
        double c = input.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }

        input.close();
    }
}