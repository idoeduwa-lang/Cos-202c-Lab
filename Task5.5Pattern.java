//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//Lab 5
//Task 5.5: Patterns. Print a right triangle of stars, an inverted triangle, and a number pyramid:
//1
//12
//123
//1234


public class Patterns {
    public static void main(String[] args) {
        System.out.println("Right Triangle:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nInverted Triangle:");
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nNumber Pyramid:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}