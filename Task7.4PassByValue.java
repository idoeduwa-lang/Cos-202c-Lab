//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 7
//Task 7.4: Pass by value. Write a method that tries to swap two int parameters. Show that the caller's variables are unchanged, and explain why.


public class PassByValue {

    public static void trySwap(int x, int y) {
        System.out.println("Inside trySwap before swap: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside trySwap after swap:  x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 50;
        int b = 80;

        System.out.println("In main before call: a = " + a + ", b = " + b);
        trySwap(a, b);
        System.out.println("In main after call:  a = " + a + ", b = " + b);
    }
}
