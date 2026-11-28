//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 4
//Task 4.1: Pass or fail. Read a score and print "Pass" or "Fail" using a pass mark of 40

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = input.nextDouble();

        if (score >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}