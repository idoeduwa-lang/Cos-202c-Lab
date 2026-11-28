//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 2
//Task 2.5: Overflow. Print Integer.MAX_VALUE + 1, then repeat using long. Explain the results.

public class Overflow {
    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE + 1: " + (Integer.MAX_VALUE + 1));

        long big = (long) Integer.MAX_VALUE + 1;
        System.out.println("Using long: " + big);
    }
}