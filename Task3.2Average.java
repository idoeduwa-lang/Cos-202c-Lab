//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science
 science
//LAB 3
//Task 3.2: Average. Read three test scores (doubles) and print their average to one decimal place.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score 1: ");
        double s1 = input.nextDouble();
        System.out.print("Enter score 2: ");
        double s2 = input.nextDouble();
        System.out.print("Enter score 3: ");
        double s3 = input.nextDouble();

        double average = (s1 + s2 + s3) / 3;

        System.out.println("Average: " + String.format("%.1f", average));

        input.close();
    }
}