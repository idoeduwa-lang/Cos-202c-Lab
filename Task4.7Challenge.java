//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 4
//Task 4.7 (challenge). Write a program that reads a year and a month number and prints the number of days in the month, handling leap years

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeap) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month! Must be 1 to 12.");
                input.close();
                return;
        }

        System.out.println("Number of days: " + days);

        input.close();
    }
}