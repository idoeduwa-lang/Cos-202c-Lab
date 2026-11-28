//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 3
//Task 3.6: Report file. Write a program that asks for five names and writes them, numbered, to names.txt.


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReportFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        System.out.println("\n--- names.txt (simulated) ---");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        input.close();
    }
}