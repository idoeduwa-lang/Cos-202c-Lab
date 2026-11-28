//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 2
//TASK 2.3
// Salary. Declare a gross salary, a tax rate constant and a deduction. Compute net salary and print it to two decimal places using String.format("%.2f", value).

public class Salary {
    public static void main(String[] args) {
        double grossSalary = 6000000;
        final double TAX_RATE = 0.10; // 10%
        double deduction =450000;

        double tax = grossSalary * TAX_RATE;
        double netSalary = grossSalary - tax - deduction;

        System.out.println("Gross Salary: " + String.format("%.2f", grossSalary));
        System.out.println("Tax: " + String.format("%.2f", tax));
        System.out.println("Deduction: " + String.format("%.2f", deduction));
        System.out.println("Net Salary: " + String.format("%.2f", netSalary));
    }
}