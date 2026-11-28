//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 3
//Task 3.3: Newline trap. Read an integer then a full name with nextLine(). Observe the problem, then fix it.


import java.util.Scanner;

public class NewlineTrap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter full name: ");
        String name = input.nextLine(); // Skipped! Reads the leftover newline
        System.out.println("Age: " + age + ", Name: [" + name + "]");
        input.close();
    }
}

//NewlineFixed
import java.util.Scanner;

public class NewlineFixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine(); // consume the leftover newline

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.println("Age: " + age + ", Name: " + name);

        input.close();
    }
}