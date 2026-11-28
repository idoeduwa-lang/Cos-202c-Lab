//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 2
//Task 2.6: Swap. Swap the values of two int variables using a third variable, then print them.

public class Swap {
    public static void main(String[] args) {
        int a = 89;
        int b = 70;

        System.out.println("Before: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After: a = " + a + ", b = " + b);
    }
}