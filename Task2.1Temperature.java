//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 2
//Task 2.1:
// Temperature. Convert 36.6 degrees Celsius to Fahrenheit using F = C x 9/5 + 32. Print the result. 

public class Temperature {
    public static void main(String[] args) {
        double celsius = 36.6;
        double fahrenheit = celsius * 9.0 / 5 + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        // What happens with 9/5 ?
        double wrong = celsius * 9 / 5 + 32;
        System.out.println("Using 9/5 (integer division): " + wrong);
    }
}
    