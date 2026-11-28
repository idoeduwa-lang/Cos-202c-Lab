//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 3
//Task 3.1: Greeting. Ask for a first name and last name and print "Welcome, Last, First".


import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = input.next();

        System.out.print("Enter last name: ");
        String last = input.next();

        System.out.println("Welcome, " + last + ", " + first + " " + middle);

        input.close();
    }
}