//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 1
//TASK 2.2
//Circle. Given a radius of 7.5, print the area and the circumference. Use Math.PI and Math.pow.

public class Circle {
    public static void main(String[] args) {
        double radius = 7.5;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}