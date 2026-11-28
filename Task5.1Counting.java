//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 5
//Task 5.1: Counting. Print the numbers 1 to 20, then the even numbers from 20 down to 2.


public class Counting {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 20; i >= 2; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}