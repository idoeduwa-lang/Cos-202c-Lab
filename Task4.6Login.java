//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 4
//Task 4.6: Login. Store a username and password in variables. Read an attempt and print "Access granted" or "Access denied". Use equals

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        input.close();
    }
}